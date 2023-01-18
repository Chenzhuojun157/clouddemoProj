package com.example.module02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Module02Application {

    public static void main(String[] args) {
        SpringApplication.run(Module02Application.class, args);
    }

}
