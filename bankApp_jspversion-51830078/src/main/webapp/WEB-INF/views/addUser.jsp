<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addUser" method="post" modelAttribute="user">
<form:hidden path="id"/>
<table>
<tr>
<td>Enter the name:<form:input path="name"/></td>
</tr>
<tr>
<td>Enter the password:<form:input path="password"/></td>
</tr>
<tr>
<td>Enter the email:<form:input path="email"/></td>
</tr>
<tr>
<td>Enter the phone:<form:input path="phone"/></td>
</tr>
<tr>
<td>Enter the address:<form:input path="address"/></td>
</tr>
<tr>
<td>Enter the roles:<form:select path="roles" items="${roles}"></form:select></td>
</tr>
<tr>
<td>Enter the active:<form:input path="active"/></td>
</tr>
</table>
<input type="submit" value="addUser">
</form:form>

</body>
</html>

