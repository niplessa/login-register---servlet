<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Login page with servlets and JSPs</title>
</head>
<body>

	<h1>Login here:</h1>
	<form method="post" action="log">
		Please enter your username: <input type="text" name="username" /><br>
		Please enter your password: <input type="password" name="password" /> <br>
		<br>
		<button style="background-color: #6495ed; color: white;"submit">
			<b>Login</b>
		</button>
	</form>

	<h1>Sign up if you don't have an account</h1>

	<form method="post" action="signup">
		Please enter desired username: <input type="text" name="username" /><br>
		Please enter desired password: <input type="password" name="password" />
		<br>
		<br>
		<button style="background-color: #6495ed; color: white;"submit">
			<b>Signup</b>
		</button>
	</form>



</body>
</html>