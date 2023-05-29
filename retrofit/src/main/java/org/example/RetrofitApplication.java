package org.example;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RetrofitScan(basePackages = "org.example.retrofit")
public class RetrofitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetrofitApplication.class, args);
    }

}
