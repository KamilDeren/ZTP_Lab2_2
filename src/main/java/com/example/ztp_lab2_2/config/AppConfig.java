package com.example.ztp_lab2_2.config;

import com.example.ztp_lab2_2.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public MyBean myBean() {
        return new MyBean();
    }
}
