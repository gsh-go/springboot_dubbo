package com.gsh.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gsh.api.service.OrderService;
import com.gsh.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: gsh
 * @Date: Created in 2019/5/29 11:02
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;


    @Override
    public String getOrderList() {
        return userService.getUserList();
    }
}
