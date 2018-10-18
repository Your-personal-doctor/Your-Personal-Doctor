<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Page</title>
<style type="text/css">
h1{text-align:center;}
</style>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//alert("check jQuery work or not");
		$("#form1").submit(function(){
			var name=$("#name").val();//get the value 
			if(name.length==0){// to check the name is not null
				$("#nameError").html("Please enter the username");
				return false;
			}
			
			//password cannot be null
			var password=$("#password").val();//get the password value 
			if(password.length==0){
				$("#passwordError").html("Please enter the password");
				return false;
			}
			
			//check the password
			var relpassword=$("#relpassword").val();//get the password value 
			if(relpassword.length==0){
				$("#relpasswordError").html("Please re-type the password");
				return false;
			}
			
			if(password!=relpassword){
				$("#relpasswordError").html("The password is different");
				return false;
			}
		});
	
	});
</script>
</head>
<body>
<form action="user/userregister" method="post" id="form1">
	<h1>Register</h1>
	<hr/>
	<table align="center">
		<tr>
			<td>*Username：</td>
			<td>
				<input type="text" name="name" id="name"/>
				<div id="nameError" style="display:inline;color:red;"></div>
			</td>
		</tr>
		<tr>
			<td>*Password：</td>
			<td>
				<input type="password" name="password" id="password">
				<div id="passwordError" style="display:inline;color:red;"></div>
			</td>
		</tr>
		<tr>
			<td>*Re-type the password：</td>
			<td>
				<input type="password" name="relpassword" id="relpassword">
				<div id="relpasswordError" style="display:inline;color:red;"></div>
			</td>
		</tr>
		<tr>
			<td>Phone number：</td>
			<td><input type="text" name="phone" id="phone"></td>
		</tr>
		<tr>
			<td>*Email：</td>
			<td><input type="text" name="email" id="email"></td>
		</tr>
		<tr>
			<td colspan="1">
			</td>
			<td>
				<input type="submit" value="submit"/>
				<input type="reset" value="reset"/>
				<a href="login.jsp" target="_blank">Login</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>