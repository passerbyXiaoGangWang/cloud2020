package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {
    //新增
    public int create(Payment payment);
    //读取
    public Payment getPaymentById(Long id);
}
