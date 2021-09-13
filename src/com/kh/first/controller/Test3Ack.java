package com.kh.first.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Test3Ack extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 1. 문자셋 변경 -test3.do 에서 했으니 패스!

        // 2. HTML 작성
        PrintWriter out = response.getWriter();

        out.println("<html>");

        out.println("<head>");
        out.println("<title>색상 테스트</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>색상 테스트</h1>");

        out.println("<p style='border: 5px solid " + request.getParameter("colorPick") + ";'");

        out.println("<h1>" + request.getParameter("colorPick")+ "선택! </h1>");
        out.println("색상 평 : " + request.getAttribute("advice"));


        out.println("</p>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
