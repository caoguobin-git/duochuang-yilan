package com.duochuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.duochuang.mapper")
public class YilanTradeTraderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YilanTradeTraderApplication.class, args);
    }

}
