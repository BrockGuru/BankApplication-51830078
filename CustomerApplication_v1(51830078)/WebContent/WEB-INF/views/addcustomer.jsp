<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
font-style:"italic";
color: red;
font-family: serif;


}

</style>
</head>
<body background="C:\Users\Lenovo\Pictures\login4.jpg">
<br>
<br>
<br>
<br>
<h1 align="center">Enter the Customer Details</h1>
<form:form action="addcustomer" method="post" modelAttribute="customer">
<%-- <form:hidden path="id"/> --%>
<center>
<h3>
<table>
<tr>
<td>Enter the firstName:</td><td><form:input path="firstname"/><form:errors path="firstname" class="error"/></td>
<tr>
<tr>
<td>Enter the LastName:</td><td><form:input path="lastname"/><form:errors path="lastname" class="error"/></td>
</tr>
<tr>
<td>Enter the Address:</td><td><form:input path="address"/><form:errors path="address" class="error"/></td>
</tr>
<tr>
<td>Enter the PhoneNumber:</td><td><form:input path="phone"/><form:errors path="phone" class="error"/></td>
</tr>
<tr>
<td>Enter the Email:</td><td><form:input path="email"/><form:errors path="email" class="error"/></td>
</tr>
<tr>
<td>Enter the Salary:</td><td><form:input path="salary"/><form:errors path="salary" class="error"/></td>
</tr>
<tr>
<td align="center">
<input type="submit" value="Add">
</td>
</tr>
</table>
</h3>
</center>
</form:form>
</body>
</html>