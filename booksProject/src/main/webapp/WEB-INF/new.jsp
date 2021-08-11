<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>New Book</h1>
<form:form action="/books" method="post" modelAttribute="book">
	<div class="form-group">
		<label path="title">Title<label>
        <form:errors path="title"/>
        <input type="text" class="form-control" path="title"/>
	</div>

	<div class="form-group">
		<form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <textarea class="form-control" path="description"></textarea>
	</div>

	<div class="form-group">
        <form:label path="language">Language</form:label>
        <form:errors path="language"/>
        <input type="text" class="form-control" path="language"/>
	</div>

	<div class="form-group">
        <form:label path="pages">Pages</form:label>
        <form:errors path="pages"/>
        <input type="number" class="form-control" path="pages"/>
	</div>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>