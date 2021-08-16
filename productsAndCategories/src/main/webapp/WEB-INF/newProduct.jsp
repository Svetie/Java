<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Product</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>New Product</h1>
	<p class="text-danger">${error}</p>
	<p class="text-success">${success}</p>

	<form:form action="/products/create" method="post" modelAttribute="product">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description"/>
			<form:textarea path="description"/>
		</p>
		<p>
			<form:label path="price">Price</form:label>
			<form:errors path="price" class="text-danger"/>
			<form:input type="number" step="any" path="price"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>