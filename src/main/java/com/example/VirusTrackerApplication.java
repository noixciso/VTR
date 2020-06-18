package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // аннотация для активации задач по расписанию
public class VirusTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirusTrackerApplication.class, args);
    }

}
