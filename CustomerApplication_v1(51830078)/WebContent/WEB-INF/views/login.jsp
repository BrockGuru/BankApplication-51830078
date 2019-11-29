<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
/* body{
  background-repeat: no-repeat;
  /* background-size: auto; */
}
*
/
</style>

</head>

<body background="C:\Users\Lenovo\Pictures\login4.jpg">
	${error} ${message}
<h2 align="center">Welcome to Customer Application</h2>
	<br>
	<br>
	<center>
		<br> <br> <br> <br> <br>

		<form:form action="login" method="post" modelAttribute="userbean">
			<table>
				<tr>
					<td><h4>Enter Email:</h4></td>
					<td><form:input path="email" />
						<form:errors path="email" class="error" /></td>
					<br />

				</tr>
				<tr>
					<td><h4>Enter password:</h4></td>
					<td><form:input path="password" />
						<form:errors path="password" class="error" /></td>
					<br />
				</tr>
					
			
			
			</table>
			<table>
			<tr>
			<td>
			<input type="submit" value="login" /></td>
			<td>
			<a href="register" ><input type="submit" value="Register" /></a></td>
			
			</tr>
			</table>

		</form:form>

	</center>

</body>
</html>