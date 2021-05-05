package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.zy.admin.mapper")
@EnableDiscoveryClient
public class GameLolAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLolAdminApplication.class, args);
    }

}
