package com.dity.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dity.gmall.bean.UserAddress;
import com.dity.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * 生产者提供服务
 * @author: yuhang
 * @date: 2018/12/10
 */
@Service // dubbo的service来暴露服务
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....old...");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        return Arrays.asList(address1,address2);
    }
}
