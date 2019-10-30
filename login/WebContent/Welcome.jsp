<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
<h1>You have succesfully logged in</h1>
<% 
String username = request.getParameter("username");
out.print("Welcome: "+username);
%>
<br>
<a href="index.jsp">Return</a>

</body>
</html>