package com.luakun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created with IntelliJ IDEA.
 *
 * @author AKunLin
 * Date: 2021/1/26  19:45
 * Description: Application
 */
@SpringBootApplication
@MapperScan(basePackages = "com.luakun.dao")
//MapperScan 用于扫描指定包下的所有的接口，将接口产生代理对象交给spriing容器
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
