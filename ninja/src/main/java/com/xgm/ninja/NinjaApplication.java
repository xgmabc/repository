package com.xgm.ninja;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(annotationClass = Repository.class, basePackages = "com.xgm.ninja.dao")
public class NinjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjaApplication.class, args);
    }

}
