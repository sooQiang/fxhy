package com.fxhy.springcloud.example.springclouduserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/7/21 9:55 上午
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Autowired
//    LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public String findById(@PathVariable("id")int id){

        /*ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-order-service");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/orders");*/
        return restTemplate.getForObject("http://spring-cloud-order-service/orders", String.class);
    }
}
