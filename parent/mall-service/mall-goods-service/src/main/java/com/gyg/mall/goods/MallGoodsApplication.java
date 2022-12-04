package com.gyg.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: mallproject
 * @description:
 * @author: gyg
 * @create: 2021-05-15 12:44
 **/

@SpringBootApplication
@MapperScan(basePackages = {"com.gyg.mall.goods.mapper"})
public class MallGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);

    }
}
    
    