package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GameEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameEurekaServerApplication.class, args);
    }

}
