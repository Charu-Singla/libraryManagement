<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Of Issues Created</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 60%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

	<div style="margin-top: 50px; margin-left: 200px; height: 50px;">
		<h2>Issue List</h2>
	</div>
	<table style="margin-top: 0px; margin-left: 100px;">
		<tr>
			<th>Id</th>
			<th>Book Name</th>
			<th>Category</th>
		
		</tr>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.categoryName}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>