package com.example.springboot_crud1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication注解:是用来表示这是一个springboot项目的启动项类,目的是开启自动配置
 * （它是继承于Configuration配置类，深解需要去剖析SpringBoot的原理）
 * @MapperScan（“com.example.springboot_crud1.mapper”）是为了扫描mapper文件，
 * 进行有效访问相关数据库文件URL映射（这个注解的作用很大！）
 */
@MapperScan("com.example.springboot_crud1.mapper")
@SpringBootApplication
public class SpringbootCrud1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCrud1Application.class, args);
    }

}
