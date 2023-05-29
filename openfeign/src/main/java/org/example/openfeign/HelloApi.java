package org.example.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "helloService", url = "http://localhost:8801")
public interface HelloService {

    @RequestMapping("/hello/boot")
    String helloBoot();

}

