<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Languages Main Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Creator</th>
					<th scope="col">Version</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lang" items="${allLangs}">
					<tr>
						<th><a href="/languages/${lang.id}">${lang.name}</a></th>
						<td>${lang.creator}</td>
						<td>${lang.currentVersion}</td>
						<td><a href="/languages/${lang.id}/delete">delete</a> <a href="/languages/${lang.id}/edit"/>edit</a> </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<form:form action="/languages" method="post" modelAttribute="language">
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
	</div>
</body>
</html>