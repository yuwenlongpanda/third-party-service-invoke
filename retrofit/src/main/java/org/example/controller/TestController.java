package org.example.controller;

import org.example.openfeign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/call")
    public String callApi(){
        return "Hello OpenFeign, " + helloService.helloBoot();
    }
}
