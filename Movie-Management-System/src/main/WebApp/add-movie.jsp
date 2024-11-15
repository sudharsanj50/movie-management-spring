<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Page</title>
<link rel="stylesheet" href="./add-movie.css">

</head>
<body>
<h1>Enter Movie Details🎦📽️</h1>
<form action="add-movies" method="post">

<input type="text" placeholder="Enter Movie Title" name="title"><br>
<input type="text" placeholder="Enter Movie Genre" name="genre"><br>
<input type="text" placeholder="Enter Movie Director" name="director"><br>
<input type="number" placeholder="Enter Movie Rating" name="rating" ><br>
<input type="submit" value="Save">

<a href="index.jsp">Back</a>

</form>
</body>
</html>