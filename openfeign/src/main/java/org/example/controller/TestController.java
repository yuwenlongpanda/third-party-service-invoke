package org.example.controller;

import org.example.openfeign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class callApiController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/callApi")
    public User callApi(){
        return helloService.callMyApi();
    }
}
