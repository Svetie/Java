<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Mian page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/script.js"></script>
</head>
<body>
    <div id="containerMain">
        <h1>Login and Registration</h1>
        <p class="text-danger">${error}</p>
        <p class="text-success">${success}</p>
        <div class="row">
            <div class="col">
                <h1>Register</h1>
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <div class="form-group">
                        <label>User Name:</label>
                        <form:input path="userName" class="form-control" />
                        <form:errors path="userName" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Email:</label>
                        <form:input path="email" class="form-control" />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <form:password path="password" class="form-control" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Confirm Password:</label>
                        <form:password path="confirm" class="form-control" />
                        <form:errors path="confirm" class="text-danger" />
                    </div>
                    <input type="submit" value="Register" class="btn btn-primary" />
                </form:form>
            </div>

            <div class="col">
                <h1>Login</h1>
                <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group">
                        <label>Email:</label>
                        <form:input path="email" class="form-control" />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <form:password path="password" class="form-control" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <input type="submit" value="Login" class="btn btn-success" />
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>