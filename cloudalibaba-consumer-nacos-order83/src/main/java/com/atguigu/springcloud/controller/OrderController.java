package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String payment_url;

    @GetMapping(value = "/cousumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        String s = restTemplate.getForObject(payment_url+"/payment/nacos/"+id,String.class);
        return s;
    }
}
