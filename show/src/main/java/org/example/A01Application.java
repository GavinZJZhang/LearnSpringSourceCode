package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A01Application {

    private static final Logger log = LoggerFactory.getLogger(A01Application.class);

    public static void main(String[] args) {
        SpringApplication.run(A01Application.class, args);


    }

}
