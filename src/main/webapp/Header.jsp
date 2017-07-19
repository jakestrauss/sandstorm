<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel = "stylesheet" type = "text/css" href = "styles/main.css" />
<link href='https://fonts.googleapis.com/css?family=Condiment' rel='stylesheet'>
<c:choose>
	    <c:when test="${not empty sandstorm}">
	        <c:set var="bodyClass" value="sandstormBody"/>
	    </c:when>
	    <c:otherwise>
	        <c:set var="bodyClass" value="body"/>
	    </c:otherwise>
</c:choose>
<title>Header</title>
</head>
<body class="${bodyClass}">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
   	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script> 
	<c:if test="${exported == true}">
		<div class="container alert alert-warning left" style="margin-bottom: -5px; margin-top:5px;">Sandstormed playlist successfully exported to your Spotify account!
		Feel free to create another playlist to sandstorm if you wish!</div>
	</c:if>
	<c:if test="${not empty playlist && empty sandstorm && playlist.size > 0}">
		<h2 style="padding-left:10px">Current Playlist</h2>
		<div class="container">
			<div class="row">
				<div class="col-md-2"><h3>Song name</h3></div>
				<div class="col-md-2"><h3>Artist name</h3></div>
			</div>
			
			<c:forEach items="${playlist.tracks}" var="track" varStatus="loop">
				<div class="row">
					<div class="col-md-2"><p class="lead">${track.name}</p></div>
					<div class="col-md-2"><p class="lead">${track.artists[0].name}</p></div>
					<c:set var="thisSongURL" value="https://open.spotify.com/embed?uri="/>
					<c:set var="thisSongURL" value="${thisSongURL}${track.uri}"/>
					<div class="col-md-4"><iframe src="${thisSongURL}" frameborder="0" allowtransparency="true"
					height="110"></iframe>
					</div>
					<div class="col-md-1">
						<form method="post" action="RemoveSongFromPlaylist">
							<button type="submit" class="btn btn-danger" name="Song index" value="${loop.index}">Remove Song</button>
						</form>
					</div>
				</div>
			</c:forEach>	
		</div>
		<c:if test="${playlist.size < 3 && playlist.size > 0}">
				<div class="container alert alert-danger alert-dismissable">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				Your playlist must have at least 3 songs in order to sandstorm it!</div>
		</c:if>
			
		<c:if test="${playlist.size >=3}">
			<div class=" container alert alert-warning">Your playlist is eligible to sandstorm!
			Click the button below to sandstorm now or add more songs if you wish
			</div>
			<form method="get" action="SandstormPlaylist">
				<button type="submit" class="btn btn-warning" style="margin-left:10px">Sandstorm Playlist</button>
			</form>
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
						<c:set var="thisSongURL" value="https://open.spotify.com/embed?uri="/>
						<c:set var="thisSongURL" value="${thisSongURL}${track.uri}"/>
					<td><iframe src="${thisSongURL}" frameborder="0" allowtransparency="true" height="110"></iframe></td>
					</tr>
				</c:forEach>	
			</table>	
	</c:if>
	<br/>
</body>
</html>