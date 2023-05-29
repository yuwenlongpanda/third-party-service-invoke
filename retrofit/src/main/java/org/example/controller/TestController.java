package org.example.controller;

import org.example.retrofit.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private HelloApi helloApi;

    @GetMapping("/call")
    public String callApi(){
        Map<String,String> map = (Map<String, String>) helloApi.helloCloud();
        return "Hello Retrofit, " + map.size();
    }
}
