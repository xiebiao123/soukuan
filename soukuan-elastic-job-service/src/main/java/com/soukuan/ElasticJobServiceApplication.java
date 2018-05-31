package com.soukuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ElasticJobServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticJobServiceApplication.class, args);
    }
}
