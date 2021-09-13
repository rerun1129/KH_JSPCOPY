<%--
  Created by IntelliJ IDEA.
  User: KYS
  Date: 2021-09-13
  Time: 오전 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  선언자 태그 :
     현재 JSP에서 사용할 전역 변수를 선언하는 태그
 --%>
<%!
int num1 = 10, num2 = 50;
%>
<%@ include file="common/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP 태그들</title>
</head>
<body>
<h1>JSP 태그들</h1>
<%--
    JSP 주석 태그
       JSP 파일이 서블릿으로 변할 때 무시되는 주석 태그
 --%>
<!--  HTML 태그 -->
<%
    // 자바 코드 구현 태그 (스크립트릿 태그)
    int sum = 0;

    for(int i = 0 ; i < 11 ; i++){
        sum += i;   // 0 ~ 10 까지의 합
    }
%>
<%-- 표현 태그 --%>
<h3>sum 결과 확인 : <%= sum %></h3>
<%-- out.println(sum) --%>

<h3>num1 + num2 = <%= num1 + num2 %></h3>

</body>
</html>
