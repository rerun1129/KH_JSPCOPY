<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: KYS
  Date: 2021-09-13
  Time: 오전 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
    <title>자바 라이브러리</title>
</head>
<body>
<h1>자바 라이브러리</h1>
<%@ include file="common/header.jsp"%>
<%
  Date now = new Date();
  String date = String.format("%tF", now);
  String time = String.format("%tp %tT",now,now);
  /*
		날짜  타입  format  ||               설명
		------------------------------------------------
		%tF				    날짜를 yyyy-mm-dd 형식으로 포맷
		%tT					날짜의 시각을 HH:MM:SS 형식으로 포맷.
		------------------------------------------------------
		%tY					4자리 년도만 출력
		%ty					2자리 년도
		%tB					월의 이름(January, February, March...)
		%tm					월을 01,02,03 ~12 로 출력
		%td					일수를 1~31 로 출력
		%te					%td 와 같음.
		%tA					요일명 출력
		---------------------------------------------------
		%tp					오전, 오후를 출력
		%tk					시간을 0~23 으로 출력.
		%tl					시간을 1~12 로 출력.
		%tM					분을 00 ~59 로 출력.
		%tS					초를 00 ~ 59 로 출력.
		-----------------------------------------------------
		%tZ					타임존을 출력 (한국은 KST)
		-------
   */

%>
<ul>
  <li>날짜 : <%=date%></li>
  <li>시간 : <%=time%></li>
</ul>
</body>
</html>
