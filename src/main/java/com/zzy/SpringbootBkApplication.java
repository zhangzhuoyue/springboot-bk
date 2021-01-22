package com.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.zzy.springbootbk.mapper")
@SpringBootApplication
public class SpringbootBkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBkApplication.class, args);
    }

}
