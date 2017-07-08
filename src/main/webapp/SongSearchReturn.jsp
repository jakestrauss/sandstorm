<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Search Return</title>
</head>
<body>
	<c:if test="${not empty playlist}">
		<h1>Current Playlist</h1>
		<table>
			<tr>
				<th>Song name</th>
				<th>Artist name</th>
				<th>Size of playlist is ${playlist.size}</th>
			</tr>
			
			<c:forEach items="${playlist.tracks}" var="track">
				<tr>
					<td>${track.name}</td>
					<td>${track.artists[0].name}</td>
				</tr>
			</c:forEach>	
		
		</table>
	</c:if>
	<h1>Search for Song</h1>
	<form method="post" action="SongSearcher">
		<input type="text" name="Song name"><br> <input
			type="submit" value="Search">
	</form>
	<br>
	<table>
		<tr>
			<th>Song name</th>
			<th>Artist name</th>
		</tr>
		
		<c:forEach items="${tracks}" var="track">
			<tr>
				<td>${track.name}</td>
				<td>${track.artists[0].name}</td>
				<td>
					<form method="post" action="AddToPlaylist">
						<button type="submit" name="Song" value="${track.id}">Add Song to Playlist</button>
					</form>
				</td>
			</tr>
		</c:forEach>	
		
	</table>



</body>
</html>