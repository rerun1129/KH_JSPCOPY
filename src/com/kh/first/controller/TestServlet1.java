package com.kh.first.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1. 문자셋 설정
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 2. 화면 작성
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title> 서블릿이란 </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>서블릿이란</h1>");
        out.println("<p>");
        out.println("서블릿은 웹 문서를 자바로 표현할 수 있게 해주는 기술이다.");
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
