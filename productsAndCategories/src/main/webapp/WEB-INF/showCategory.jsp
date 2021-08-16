<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Show category</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>${category.name}</h1>

	<h3>Products:</h3>
	<ul>
		<c:forEach var='product' items='${ category.products }'>
			<li>${product.name}</li>
		</c:forEach>
	</ul>

	<form action="/addProduct/${category.id}" method="POST">
		<label for="productId">Add Category:</label>
		<select name="productId">
			<c:forEach var='product' items='${ allProducts }'>
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Add">
	</form>
</body>
</html>