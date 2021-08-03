package com.fxhy.springcloud.example.springcloudorderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/7/21 9:53 上午
 */
@RestController
public class OrderService {

    @Value("${server.port}")
    private int port;

    @GetMapping("/orders")
    public String getAllOrder(){


        return "all order :"+port;
    }
}
