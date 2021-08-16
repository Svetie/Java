<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>${product.name}</h1>

	<h3>Categories:</h3>
	<ul>
		<c:forEach var='category' items='${ product.categories }'>
			<li>${category.name}</li>
		</c:forEach>
	</ul>

	<form action="/addCategory/${product.id}" method="POST">
		<label for="categoryId">Add Category:</label>
		<select name="categoryId">
			<c:forEach var='category' items='${ allCategories }'>
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Add">
	</form>
</body>
</html>