package com.springboot.filter.config;

import com.springboot.filter.servlet3.SheServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  ServletConfig
 * @date : 2018/7/18 0018
 * @time : 21:33
 * @createTime 2018-07-18 21:33
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean sheServletRegistrationBean() {


        ServletRegistrationBean registrationBean = new ServletRegistrationBean(
                new SheServlet(),
                "/servlet/sheServlet");

        return registrationBean;


    }
}
