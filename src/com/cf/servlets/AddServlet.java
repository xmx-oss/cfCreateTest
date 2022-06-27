package com.cf.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1、获取用户发送给我的数据，需要继承方法
 */
public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //从请求中获取参数
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String total = request.getParameter("total");
        String remark = request.getParameter("remark");

        System.out.println(name);
        System.out.println(price);
        System.out.println(total);
        System.out.println(remark);
    }
}
