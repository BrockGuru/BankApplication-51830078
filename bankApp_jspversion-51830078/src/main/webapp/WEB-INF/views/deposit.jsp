<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<center><form:form action="deposit" method="post" modelAttribute="deposit">
<table>
<tr>
<td>enter the AccountNumber:</td><td><form:input path="accountnumber"/></td>
<td>enter the Amount:</td><td><form:input path="amount"/></td>
</tr>
</table>
<center><input type="submit" value="deposit"></center>
</form:form></center>
</body>
</html>
