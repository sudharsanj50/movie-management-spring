<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.spring.mms.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
<link rel="stylesheet" href="./update-movie.css">
</head>
<body>
<h1>Edit Movie Details🎦📽️</h1>

<%   Movie movie= (Movie)request.getAttribute("movies");
    %>
   
<form action="update-movies" method="post">

<input type="text" value="<%=movie.getMovieId()%>" name="movieId" readonly="readonly"><br>

<input type="text" value="<%=movie.getTitle()%>" name="title"><br>
<input type="text" value="<%=movie.getGenre()%>" name="genre"><br>
<input type="text" value="<%=movie.getDirector()%>" name="director"><br>
<input type="number" value="<%=movie.getRating()%>" name="rating"><br>
<input type="submit" value="Update">

  <a href="index.jsp">Back</a>
</form>
</body>
</html>