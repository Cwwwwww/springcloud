package com.cw.controller;

import com.cw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return service.hiService(name);
    }
}
