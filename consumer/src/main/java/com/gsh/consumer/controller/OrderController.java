package com.gsh.consumer.controller;

import com.gsh.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: gsh
 * @Date: Created in 2019/5/29 11:06
 * @Description:
 */
@Controller
@RequestMapping("/consumer")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     *
     * @return
     */
    @ResponseBody   //以json格式返回
    @RequestMapping("/getOrderList")
    public String getOrderList(){
        return orderService.getOrderList();
    }
}
