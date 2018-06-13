package com.cw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HiController {

    @Value("${content}")
    String content;

    @GetMapping("/hi")
    public String hi() {
        return content;
    }
}
