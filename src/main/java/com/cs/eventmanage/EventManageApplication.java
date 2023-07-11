package com.cs.eventmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = "com.cs.eventmanage"
)
public class EventManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManageApplication.class, args);
    }

}
