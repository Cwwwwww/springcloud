package com.cw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

    @GetMapping("/hi")
    public String home() {
        return "hi, I'm miya";
    }
}
