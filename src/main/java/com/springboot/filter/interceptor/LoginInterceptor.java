package com.springboot.filter.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  LoginInterceptor
 * @date : 2018/7/15 0015
 * @time : 23:14
 * @createTime 2018-07-15 23:14
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("已经进入了登录拦截器......");

        // 逻辑代码按照之前的方式去编写即可


        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
