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
	<div id="containerIndex">
		<form action='/save' method='post'>

            <div class="inputLine">
                <label for='name' class="labelArea">Your Name:</label>
                <input type='text' name='name' id="nameInput">
            </div>

            <div id="locInput" class="inputLine">
                <label for="location" name="location"  class="labelArea">Dojo Location:</label>
                <select name="location">
                    <option>Chicago</option>
                    <option>San Jose</option>
                    <option>New York</option>
                    <option>Dallas</option>
                </select>
            </div>

            <div id="langInput" class="inputLine">
                <label for="language" name="language"  class="labelArea">Favorite Language:</label>
                <select name="language">
                    <option value="Python">Pyhton</option>
                    <option value="Java">Java</option>
                    <option value="C#">C#</option>
                    <option value="Javascript">Javascript</option>
                </select>
            </div>

            <div id="commentInput">
                <label for="comment" name="comment">Comment (optional)</label>
                <textarea name="comment" id="idText" cols="30" rows="5"></textarea>
            </div>

            <div id="buttonLine" class="inputLine">
                <button type="submit">Submit</button>
            </div>
        </form>
	</div>
</body>
</html>