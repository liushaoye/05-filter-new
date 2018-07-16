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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String jsp(Model model) {
        model.addAttribute("msg", "Spring Boot Jsp 返回页面");
        return "index";
    }
}
