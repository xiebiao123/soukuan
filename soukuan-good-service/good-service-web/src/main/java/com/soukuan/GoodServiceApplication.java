package com.soukuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.soukuan.mapper")
@EnableTransactionManagement
@EnableFeignClients
public class GoodServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodServiceApplication.class, args);
    }
}
