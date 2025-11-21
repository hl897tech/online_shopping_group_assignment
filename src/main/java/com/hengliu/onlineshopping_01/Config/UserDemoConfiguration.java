package com.hengliu.onlineshopping_01.Config;

import com.hengliu.onlineshopping_01.Module.UserDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDemoConfiguration {
    @Bean(name = "z3")
    public UserDemo defaultDemo(){
        return UserDemo.builder()
                .id(0)
                .name("default")
                .email("No such User exists")
                .build();
    }
    @Bean(name = "l4")
    public UserDemo defaultDemo2(){
        return UserDemo.builder()
                .id(-1)
                .name("default")
                .email("No such User exists")
                .build();
    }
}
