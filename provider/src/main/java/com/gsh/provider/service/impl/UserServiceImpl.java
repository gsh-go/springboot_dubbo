package com.gsh.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gsh.api.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: gsh
 * @Date: Created in 2019/5/29 10:55
 * @Description:
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUserList() {
        return "getUserList from ServiceProvider";
    }
}
