package com.springboot.filter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.springboot.filter.interceptor.LoginInterceptor;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  WebConfig
 * @date : 2018/7/15 0015
 * @time : 23:30
 * @createTime 2018-07-15 23:30
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

// 当前类变成配置拦截器类
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 需要拦截的路径
        String[] addPathPatterns = {"/test/**"};

        //不拦截的路径
        String[] excludePathPatterns = {"/index", "/myjsp"};


//        注册登录拦截器(此拦截器注册多行就是,添加多个拦截器)
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns(addPathPatterns).
                excludePathPatterns(excludePathPatterns);
    }
}
