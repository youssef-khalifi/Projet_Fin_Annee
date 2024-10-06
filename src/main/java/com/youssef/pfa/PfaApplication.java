package com.youssef.pfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PfaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaApplication.class, args);
    }

}
