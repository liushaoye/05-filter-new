package com.springboot.filter.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/******************************
 * @author : liuyang
 * <p>ProjectName:05-filter  </p>
 * @ClassName :  MyServlet
 * @date : 2018/7/16 0016
 * @time : 11:00
 * @createTime 2018-07-16 11:00
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = -7864798058212193346L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("My Servlet Hello World!!!");
        response.getWriter().flush();
        response.getWriter().close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
