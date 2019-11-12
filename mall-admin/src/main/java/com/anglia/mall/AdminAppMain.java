package com.anglia.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value={"classpath:application.properties"})
public class AdminAppMain {
    public static void main(String[] args) {
        SpringApplication.run(AdminAppMain.class, args);
    }
}
