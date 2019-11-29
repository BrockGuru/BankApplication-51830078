<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\Lenovo\Pictures\login4.jpg">
<br>
<br>
<br>
<br>
<center>
<h1>
<h1>Welcome ${user.username}</h1>
<table border="1" bgcolor="yellow" width="600">
<thead>
<tr>
<th>id</th>
<th>firstname</th>
<th>lastname</th>
<th> address</th>
<th> phone</th>
<th>email</th>
<th> salary</th>
<th>update</th>
<th>delete</th>
</tr>
</thead>
<tbody>
<c:forEach items="${Customer }" var="cus">
<tr>
<td>${cus.id}</td>
<td>${cus.firstname}</td>
<td>${cus.lastname}</td>
<td>${cus.address}</td>
<td>${cus.phone}</td>
<td>${cus.email}</td>
<td>${cus.salary}</td>
<td><a href="update?id=${cus.id}">update</a></td>
<td><a href="delete?id=${cus.id}">delete</a></td>
</tr>

</c:forEach>

</tbody>

</table>
</h1>
<table>
<tr>

<td><h3><a href="addcustomer"><input type="submit" value="addCustomer"/></a></h3></td>
<td><h3><a href="logout"><input type="submit" value="Logout"/></a></h3></td>
</tr>
</table>
</center>
</body>
</html>