<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Album Search Return</title>
</head>
<body>
	<table>
		<tr>
			<th>Album Name</th>
		</tr>
		
		<c:forEach items="${albums}" var="album">
			<tr>
				<td>${album.name}</td>
				<td>${album.artists[0].name}</td>
				<td>
					<form method="post" action="AlbumExamine">
						<button type="submit" name="Album name" value="${album.id}">Select album</button>
					</form>
				</td>
			</tr>
		</c:forEach>	
		
	</table>



</body>
</html>