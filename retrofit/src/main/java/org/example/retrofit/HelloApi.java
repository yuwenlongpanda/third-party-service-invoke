package org.example.retrofit;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.GET;

@RetrofitClient(baseUrl = "http://localhost:8801")
public interface HelloService {

    @GET("/hello/boot")
    String helloBoot();

}

