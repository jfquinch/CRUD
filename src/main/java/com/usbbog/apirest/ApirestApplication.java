package com.usbbog.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.usbbog.apirest")
public class ApirestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApirestApplication.class, args);
    }

}
