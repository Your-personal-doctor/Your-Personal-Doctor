<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<style type="text/css">
h1{text-align:center;}
</style>

</head>
<body>
<form action="user/userlogin" method="post">
	<h1>Login</h1>
	<hr/>
        <table align="center">
		<tr>
			<td>Username：</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>Password：</td>
			<td><input type="password" name="password" id="password"></td>
		</tr>
		<tr>
			<td colspan="1">
			</td>
			<td>
				<input type="submit" value="submit"/>
				<input type="reset" value="reset"/>
				<a href="register.jsp" target="_blank">Register</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>