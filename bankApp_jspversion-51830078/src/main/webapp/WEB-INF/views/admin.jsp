<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>All_transaction</h3>
	
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
				<th>phone</th>
				<th>address</th>
				<th>active</th>
</tr>
		</thead>
		<tbody>
		<c:forEach items="${users}" var="user">
		<tr>
		<td>${user.id}</td>
		<td>${user.name}</td>
		<td>${user.email}</td>
		<td>${user.phone}</td>
		<td>${user.address}</td>
		<td>${user.active}</td>
		<td><a href="update?id=${user.id}">update</a></td>
		<td><a href="delete?id=${user.id}">delete</a></td>
		</tr>
		</c:forEach>
		
		</tbody>
	</table>
	<table>
	<tr>
	<td>
	<a href="addUser"><input type="button" value="AddUser"/></a>
	</td>
<td><h3><a href="home"><input type="button" value="Home"/></a></h3></td>
	</tr>
	</table>
</body>
</html>
 private Long id;
    private LocalDate transactionDate;
    private String type;
    private double amount;