package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    //两个参数的构造
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}