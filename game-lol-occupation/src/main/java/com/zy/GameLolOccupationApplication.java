package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zy.occupation.mapper")
public class GameLolOccupationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLolOccupationApplication.class, args);
    }

}
