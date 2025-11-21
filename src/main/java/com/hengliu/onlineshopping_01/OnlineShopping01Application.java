package com.hengliu.onlineshopping_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hengliu.onlineshopping_01.db.mappers")
public class OnlineShopping01Application {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopping01Application.class, args);
    }

}
