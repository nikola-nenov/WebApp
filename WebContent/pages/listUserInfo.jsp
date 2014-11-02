<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List users</title>
</head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
<body>
	<h1>User`s log information table</h1>
	<a href="http://127.0.0.1:8080/web-task/connection">Connectons</a>
	<div class="table">
		<table style="width: 100%">
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.rollNo }</td>
					<td>${user.ip }</td>
				</tr>
				<tr>
					<td>${user.rollNo }</td>
					<td>${user.userAgent }</td>
				</tr>
				<tr>
					<td>${user.rollNo }</td>
					<td>${user.date}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>