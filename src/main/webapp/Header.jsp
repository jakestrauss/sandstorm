<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header</title>
</head>
<body>
	<c:if test="${exported == true}">
		<h3><font color="#BCB028">Sandstormed playlist successfully exported to your Spotify account!<br/>
		Feel free to create another playlist to sandstorm if you wish!</font></h3>
		<c:set var="exported" scope="session" value="false"/>
	</c:if>
	<c:if test="${not empty playlist && empty sandstorm && playlist.size > 0}">
		<h2>Current Playlist</h2>
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
		<c:if test="${playlist.size < 3 && playlist.size > 0}">
				<h4><font color="red">Your playlist must have at least 3 songs in order to sandstorm it!</font></h4>
		</c:if>
			
		<c:if test="${playlist.size >=3}">
			<table>
				<tr>
					<td> <h4><font color="red">Your playlist is eligible to sandstorm!</font></h4> </td>
					<td>
						<form method="post" action="SandstormPlaylist">
							<button type="submit">Sandstorm Playlist</button>
						</form>
					</td>
				</tr>
			</table>
		</c:if>
	</c:if>
	
	<c:if test="${not empty sandstorm}">
		<h2><font color="#BCB028">Sandstormed Playlist</font></h2>
			<table>
				<tr>
					<th><font color="#BCB028">Song name</font></th>
					<th><font color="#BCB028">Artist name</font></th>
				</tr>
				
				<c:forEach items="${playlist.tracks}" var="track">
					<tr>
						<td><font color="#BCB028">${track.name}</font></td>
						<td><font color="#BCB028">${track.artists[0].name}</font></td>
					</tr>
				</c:forEach>	
			</table>	
	</c:if>
</body>
</html>