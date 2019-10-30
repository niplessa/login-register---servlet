<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account created succesfully</title>
</head>
<body>
<h1>Account created</h1>
<% 
String username = request.getParameter("username");
out.print(username); 
out.print(" you have created an account!");
%>

<br>
<a href="index.jsp">Return</a>
</body>
</html>