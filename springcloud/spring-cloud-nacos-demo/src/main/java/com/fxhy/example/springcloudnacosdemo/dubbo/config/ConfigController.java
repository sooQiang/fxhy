package com.fxhy.example.springcloudnacosdemo.dubbo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/8/3 2:15 下午
 */
@RefreshScope  //spring注解，表示当前类中的属性，需要动态刷新
@RestController
public class ConfigController {
    //value中的key，是来自于enviroment中的propertySource
    @Value("${info:hello fx}")
    private  String info;

    @GetMapping("/get")
    public String get(){
        return info;
    }
}
