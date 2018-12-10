package com.dity.gmall;

import com.dity.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: yuhang
 * @date: 2018/12/10
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc
                = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        OrderService bean = ioc.getBean(OrderService.class);
        System.out.println(bean.initOrder("1"));

        System.in.read();
    }
}
