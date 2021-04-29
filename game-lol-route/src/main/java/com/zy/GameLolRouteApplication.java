package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zy.route.mapper")
public class GameLolRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLolRouteApplication.class, args);
    }

}
