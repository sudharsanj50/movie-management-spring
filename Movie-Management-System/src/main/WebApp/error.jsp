<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
<link rel="stylesheet" href="./error.css">
</head>
<body>
<%
      String msg= (String) request.getAttribute("errorMessage");
	String url=(String) request.getAttribute("redirectTo");
    %>
    
    <h1><%=msg %></h1><br>
  <a href="<%=url%>">Back</a>

</body>
</html>