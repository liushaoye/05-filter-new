package com.springboot.filter.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  HeServlet
 * @date : 2018/7/18 0018
 * @time : 21:03
 * @createTime 2018-07-18 21:03
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class HeServlet extends HttpServlet {

    private static final long serialVersionUID = 9040678112053909135L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("He Servlet Hello World!!!");
        response.getWriter().flush();
        response.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
