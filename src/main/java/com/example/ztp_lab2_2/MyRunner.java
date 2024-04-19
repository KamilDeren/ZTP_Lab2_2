package com.example.ztp_lab2_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private MyBean myBean1;

    @Autowired
    private MyBean myBean2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HashCode for myBean1: " + myBean1.hashCode());
        System.out.println("HashCode for myBean2: " + myBean2.hashCode());
    }
}
