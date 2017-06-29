<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Artist Search Return</title>
</head>
<body>
	<table>
		<tr>
			<th>Artist Name</th>
		</tr>
		
		<c:forEach items="${artists}" var="artist">
			<tr>
				<td>${artist.name}</td>
				<td>
					<form method="post" action="ArtistExamine">
						<button type="submit" name="Artist name" value="${artist.id}">Select Artist</button>
					</form>
				</td>
			</tr>
		</c:forEach>	
		
	</table>



</body>
</html>