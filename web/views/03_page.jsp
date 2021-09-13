<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: KYS
  Date: 2021-09-13
  Time: 오후 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!

%>

<html>
<head>
    <meta charset="UTF-8">
    <title>include 사용하기</title>
</head>
<body>
    <%@ include file="common/header.jsp"%>
    <h1>include 사용하기</h1>
    <h3>오늘 날짜 : </h3>
    <%@ include file="02_page.jsp" %>


</body>
</html>
