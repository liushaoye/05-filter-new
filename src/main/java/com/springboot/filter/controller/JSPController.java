package com.springboot.filter.controller;

/******************************
 * @author : liuyang
 * <p>ProjectName:sprinboot  </p>
 * @ClassName :  JSPController
 * @date : 2018/7/7 0007
 * @time : 5:13
 * @createTime 2018-07-07 5:13
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSPController {

    @GetMapping("/myjsp")
    public String jsp(Model model) {

        model.addAttribute("msg", "Spring Boot Jsp 返回页面");

        return "testJsp";
    }
}
