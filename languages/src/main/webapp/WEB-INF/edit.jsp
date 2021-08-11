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
	<a href="/languages">Dashboard</a>
	<a href="/languages/${lang.id}/delete">Delete</a>

	<h1>Edit language ${lang.name}</h1>

	<form:form action="/languages/${lang.id}" method="post" modelAttribute="lang">
		<input type="hidden" name="_method" value="put">
		<div class="form-group">
			<form:label path="name">Name</form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" class="text-danger"/>
			<form:input path="creator" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" class="text-danger"/>
			<form:input path="currentVersion" class="form-control"/>
		</div>
		<input type="submit" value="Submit" class="btn btn-primary"/>
	</form:form>
</body>
</html>