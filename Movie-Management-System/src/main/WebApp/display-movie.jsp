<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@page import="com.spring.mms.entity.Movie" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
<link rel="stylesheet" href="./display-movie.css">
</head>
<body>
<h1>Movie Details🎦📽️</h1>
<%
      List<Movie> movies= (List<Movie>)request.getAttribute("movies");
%>

	<table border="1px">
		<thead>
			<tr>
				<td>MOVIE_ID</td>
				<td>TITLE</td>
				<td>GENRE</td>
				<td>DIRECTOR</td>
				<td>RATING</td>
				<td>UPDATE</td>
				<td>DELETE</td>
			</tr>
		</thead>
		
	    <%for(Movie movie:movies) {%>
        
        <tbody>
            <td><%=movie.getMovieId() %></td>
            <td><%=movie.getTitle() %></td>
            <td><%=movie.getGenre() %></td>
            <td><%=movie.getDirector() %></td>
            <td><%=movie.getRating() %></td>
            <td><a href="update-movies?movie_id=<%= movie.getMovieId() %>">Edit</a></td>
            <td><a href="delete-movies?movie_id=<%= movie.getMovieId() %>">Remove</a></td>
        </tbody>
     
        <%} %>
	</table>
	<h3><a href="index.jsp">Back</a></h3>

</body>
</html>