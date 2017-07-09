<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header</title>
</head>
<body>
	<c:if test="${not empty playlist}">
		<h1>Current Playlist</h1>
		<table>
			<tr>
				<th>Song name</th>
				<th>Artist name</th>
			</tr>
			
			<c:forEach items="${playlist.tracks}" var="track" varStatus="loop">
				<tr>
					<td>${track.name}</td>
					<td>${track.artists[0].name}</td>
					<td>
						<form method="post" action="RemoveSongFromPlaylist">
							<button type="submit" name="Song index" value="${loop.index}">Remove Song</button>
						</form>
					</td>
				</tr>
			</c:forEach>	
		
		</table>
	</c:if>
</body>
</html>