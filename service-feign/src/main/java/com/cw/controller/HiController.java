package com.cw.controller;

import com.cw.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi serviceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("name") String name) {
        return serviceHi.sayHiFromClientOne(name);
    }
}
