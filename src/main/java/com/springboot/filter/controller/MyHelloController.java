package com.springboot.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************
 * @author : liuyang
 * <p>ProjectName:sprinboot  </p>
 * @ClassName :  HelloController
 * @date : 2018/7/7 0007
 * @time : 3:47
 * @createTime 2018-07-07 3:47
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@RestController
@RequestMapping(value = "/test")
public class MyHelloController {

    @RequestMapping(value = "/test")
    public String hello(){
        return "test";
    }
}
