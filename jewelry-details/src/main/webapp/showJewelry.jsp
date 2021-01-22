<%@page import="com.hcl.web.model.Jewelry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
	Jewelry j1 = (Jewelry)session.getAttribute("jewelry");
	out.println(j1);
	
	
	%>
	
</body>
</html>