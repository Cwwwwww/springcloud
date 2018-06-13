package com.cw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinHiController {

    private static final Logger logger = LoggerFactory.getLogger(ZipkinHiController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String callHome() {
        logger.info("calling trace zipkin-hi");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @GetMapping("/info")
    public String info() {
        logger.info("calling trace zipkin-hi");
        return "I'm zipkin-hi";
    }
}
