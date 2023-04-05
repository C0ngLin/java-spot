package com.cl.spot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cl.spot.mapper")
@SpringBootApplication
public class SpotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotApplication.class, args);
    }

}
