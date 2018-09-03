package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private final CityMapper mapper;

    public DemoApplication(CityMapper mapper) {
        this.mapper = mapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //@Bean
    CommandLineRunner sampleCommandLineRunner() {
        //  return args -> System.out.println(this.mapper.findByState(args[0]));
        return args -> {
        };
    }
}
