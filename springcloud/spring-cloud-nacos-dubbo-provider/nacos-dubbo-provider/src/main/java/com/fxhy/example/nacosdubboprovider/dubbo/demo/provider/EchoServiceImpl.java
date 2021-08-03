package com.fxhy.example.nacosdubboprovider.dubbo.demo.provider;

import com.fxhy.example.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/8/3 4:22 下午
 */
@DubboService(protocol = "dubbo")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "[echo] Hello,"+message;
    }
}
