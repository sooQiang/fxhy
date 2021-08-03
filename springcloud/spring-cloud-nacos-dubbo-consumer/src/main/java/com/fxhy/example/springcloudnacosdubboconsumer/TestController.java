package com.fxhy.example.springcloudnacosdubboconsumer;

import com.fxhy.example.api.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/8/3 4:36 下午
 */
@RestController
public class TestController {

    @DubboReference
    EchoService echoService;

    @GetMapping("/call")
    public String call(){
       return echoService.echo("fxhy");
    }
}
