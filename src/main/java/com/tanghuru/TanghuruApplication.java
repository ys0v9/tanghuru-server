package com.tanghuru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.tanghuru.model")
@EnableJpaRepositories(basePackages = "com.tanghuru.repository")
public class TanghuruApplication {

    public static void main(String[] args) {
        SpringApplication.run(TanghuruApplication.class, args);
    }
}

