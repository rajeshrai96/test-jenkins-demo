package com.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsDemoApplication {
    private Logger logger = LoggerFactory.getLogger(TestJenkinsDemoApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Application executed...................");
    }

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsDemoApplication.class, args);
    }

}
