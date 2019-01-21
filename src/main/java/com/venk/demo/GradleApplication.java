package com.venk.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Slf4j
@SpringBootApplication
public class GradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleApplication.class, args);
        log.info("{} {} {}", "Hello", "World!", new Date());
    }

}

