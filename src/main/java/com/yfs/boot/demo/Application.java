package com.yfs.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/7/1.
 */
@EnableScheduling
@EnableAsync
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
