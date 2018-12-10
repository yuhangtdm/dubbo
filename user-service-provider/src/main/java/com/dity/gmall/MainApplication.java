package com.dity.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml版本的dubbo
 * 1.引入dubbo依赖
 * 2.写服务提供者接口
 * 3.配置到xml中
 *
 * 注解版本的dubbo
 * 配置dubbo扫描包
 * @Service接口暴露服务
 * @author: yuhang
 * @date: 2018/12/10
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext("classpath:provider.xml");

        //
        System.in.read();
    }
}
