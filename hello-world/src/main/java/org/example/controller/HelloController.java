package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @RequestMapping("/boot")
    public String helloBoot() {
        return "Hello Spring Boot";
    }
}
