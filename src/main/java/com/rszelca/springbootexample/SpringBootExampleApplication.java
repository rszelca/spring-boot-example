package com.rszelca.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        System.out.print("test");
        SpringApplication.run(SpringBootExampleApplication.class, args);
        
    }
}
