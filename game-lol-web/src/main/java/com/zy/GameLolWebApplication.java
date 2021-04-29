package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.zy.web.api"})
public class GameLolWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLolWebApplication.class, args);
    }

}
