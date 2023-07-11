package com.cs.eventmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = "com.cs.eventmanage"
)
@MapperScan("com.cs.eventmanage.dao")
public class EventManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManageApplication.class, args);
    }

}
