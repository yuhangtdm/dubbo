package com.dity.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dity.gmall.bean.UserAddress;
import com.dity.gmall.service.OrderService;
import com.dity.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yuhang
 * @date: 2018/12/10
 */
@Service
public class OrderServiceImpl implements OrderService {
//    @Reference
    @Autowired
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
