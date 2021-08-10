<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/css/style.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div id="containerResult">
		<h2>Submitted Info</h2>
        <div class="inputLine">
            <p>Name:</p>
            <p>${name}</p>
        </div>
        <div class="inputLine">
            <p>Dojo Location: </p>
            <p>${location}</p>
        </div>
        <div class="inputLine">
            <p>Favorite Language:</p>
            <p>${language}</p>
        </div>
        <div class="inputLine">
            <p>Comment:</p>
            <p>${comment}</p>
        </div>

        <form action="/" method="GET">
            <button type="submit" id="goBackBtn">Go back</button>
        </form>
	</div>
</body>
</html>