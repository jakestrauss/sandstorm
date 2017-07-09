<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Search Return</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
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

	<jsp:include page="BackToHome.jsp" />


</body>
</html>