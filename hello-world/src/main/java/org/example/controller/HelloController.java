package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/boot")
    public String helloBoot() {
        return "Hello Spring Boot";
    }

    @GetMapping("/cloud")
    public Object  helloCloud() {
        Map<String,String> map = new HashMap<>();
        map.put("1","Spring Boot");
        map.put("2","Spring Cloud");
        return map;
    }

}
