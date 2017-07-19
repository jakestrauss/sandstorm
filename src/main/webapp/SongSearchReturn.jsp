<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Search Return</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<c:if test="${not addedToPlaylist && playlist.size >= 1}">
		<h4>That song is already in the playlist!</h4>
	</c:if>

	<c:if test="${not empty playlist}">
		<br>
		<br>
	</c:if>
	
	<h2 style="margin-left:10px">Search Results</h2>
	<div class="container">
		<div class="row">
			<div class="col-md-2"><h3>Song name</h3></div>
			<div class="col-md-2"><h3>Artist name</h3></div>
		</div>

		<c:forEach items="${tracks}" var="track">
			<div class="row">
				<div class="col-md-2"><p class="lead">${track.name}</p></div>
				<div class="col-md-2"><p class="lead">${track.artists[0].name}</p></div>
				<div class="col-md-4">
					<c:set var="thisSongURL" value="https://open.spotify.com/embed?uri="/>
					<c:set var="thisSongURL" value="${thisSongURL}${track.uri}"/>
					<iframe src="${thisSongURL}" frameborder="0" allowtransparency="true" height="110"></iframe>
				</div>
				
				<c:set var="notYetAdded" value="true"/>
				<c:forEach items="${playlist.tracks}" var="playlistTrack">
					<c:if test="${track.id eq playlistTrack.id}">
						<c:set var="notYetAdded" value="false"/>
					</c:if>
				</c:forEach>
					<c:if test="${notYetAdded eq true}">
						<div class="col-md-2">
							<form method="post" action="AddToPlaylist">
								<button type="submit" class="btn btn-success" name="Song" value="${track.id}">Add
									Song to Playlist</button>
							</form>
						</div>
					</c:if>
			</div>
		</c:forEach>
	</div>

	<jsp:include page="BackToHome.jsp" />


</body>
</html>