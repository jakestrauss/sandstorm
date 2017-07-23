<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Album Search Return</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<jsp:include page="BackToHome.jsp" />
	<br>
	<div class="container">
		<div class = "row">
			<div class="col-md-2"><h3>Album Name</h3></div>
		</div>
		
		<c:forEach items="${albums}" var="album">
			<div class="row">
				<div class="col-md-2"><p class="lead">${album.name}</p></div>
				<div class="col-md-2">${album.artists[0].name}</p></div>
				<div class="col-md-2">
					<form method="post" action="AlbumExamine">
						<button type="submit" name="Album name" class="btn btn-primary" 
						value="${album.id}">Select album</button>
					</form>
				</div>
			</div>
		</c:forEach>	
		
	</div>


</body>
</html>