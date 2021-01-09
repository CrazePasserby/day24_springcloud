package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient     //注册服务时使用此注解  E版本以后可以省略配置
public class MovieServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApp.class, args);
    }
}
