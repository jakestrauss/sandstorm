<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Search Return</title>
</head>
<body>
	<h1>Search for Song</h1>
    	<form method="post" action="SongSearcher">
        	<input type = "text" name="Song name"><br>
        	<input type = "submit" value="Search">
        </form>
    <br>
    <% if((Integer)session.getAttribute("numResults") == 0) { %>
    	Server Error/no matched songs
    <% } %>
    <% if((Integer)session.getAttribute("numResults") != 0) { %>
    	There are <%= session.getAttribute("numResults") %> matches for this song
    <% } %>
    
</body>
</html>