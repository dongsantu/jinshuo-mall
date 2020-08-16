package com.jinshuo.mall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jinshuo.mall.admin.infra.mapper")
public class JinshuoAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(JinshuoAdminApplication.class, args);
        System.out.println(" --- jinshuo start ---");
    }

}
