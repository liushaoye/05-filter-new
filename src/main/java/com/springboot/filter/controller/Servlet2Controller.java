package com.springboot.filter.controller;

import com.springboot.filter.servlet2.HeServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  Servlet2Controller
 * @date : 2018/7/18 0018
 * @time : 21:04
 * @createTime 2018-07-18 21:04
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Controller
public class Servlet2Controller {


    @Bean
    public ServletRegistrationBean heServletRegistrationBean() {


        ServletRegistrationBean registrationBean = new ServletRegistrationBean(
                new HeServlet(),
                "/servlet/heServlet");

        return registrationBean;


    }
}
