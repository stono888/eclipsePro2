<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="TestActionContext.action?name=stono">Test ActionContext</a>
	<%
		if (application.getAttribute("date") == null) {
			application.setAttribute("date", new Date());
		}
		request.setAttribute("req", "reqValue");
	%>
	<br>
	<br>
	<a href="TestAware?name=stonoAware">Test Aware</a>
	<br>
	<br>
	<a href="TestServletAction.action">TestServletAction</a>
	<br>
	<br>
	<a href="TestServletAwareAction.action">TestServletAwareAction</a>
	<br>
	<br>
	<a href="Login-ui.do">Login UI</a>
	<br>
	<br>
	<a href="testActionSupport">testActionSupport</a>
	<br>
	<br>
	<a href="testResult.do?number=4">test result</a>
</body>
</html>