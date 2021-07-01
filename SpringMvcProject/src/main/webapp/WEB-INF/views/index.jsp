<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<p>This is home page</p>
	<h1>Called by home controller</h1>


	<%
	String name = (String) request.getAttribute("name");
	int price = (Integer) request.getAttribute("price");
	ArrayList<String> city = (ArrayList<String>) request.getAttribute("c");
	%>

	<h1>
		My name is
		<%=name%></h1>
	<h1>
		Price is
		<%=price%></h1>

	<%
	for (String x : city) {
	%>
	<h1><%=x%></h1>

	<%
	}
	%>


</body>
</html>