package com.cw.provider;

import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.metrics.web.servlet.WebMvcTags;
import org.springframework.boot.actuate.metrics.web.servlet.WebMvcTagsProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoTagsProvider implements WebMvcTagsProvider {

    public static final Logger logger = LoggerFactory.getLogger(DemoTagsProvider.class);

    @Override
    public Iterable<Tag> getTags(HttpServletRequest request,
                                 HttpServletResponse response,
                                 Object handler,
                                 Throwable exception) {
        return Tags.of(WebMvcTags.method(request),
                WebMvcTags.uri(request,response),
                WebMvcTags.status(response));
    }

    @Override
    public Iterable<Tag> getLongRequestTags(HttpServletRequest request, Object handler) {
        return Tags.of(WebMvcTags.method(request), WebMvcTags.uri(request, null));
    }
}
