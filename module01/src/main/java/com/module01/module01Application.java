package com.module01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.module01.mapper"})
public class module01Application {
    public static void main(String[] args) {
        SpringApplication.run(module01Application.class, args);
    }
}
