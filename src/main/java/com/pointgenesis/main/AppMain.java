package com.pointgenesis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppMain {
    @RequestMapping("/home")
    String home() {
        return "This is my first Spring Boot application!";
    }
    
    @RequestMapping("/dog")
    String dog() {
    	return "Dog";
    }
    
    @RequestMapping("/cat.action")
    String cat() {
    	return "Cat";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppMain.class, args);
    }
}
