<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Artist Search Return</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<jsp:include page="BackToHome.jsp" />
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-2"><h3>Artist Name<h3></div>
		</div>
		
		<c:forEach items="${artists}" var="artist">
			<div class="row">
				<div class="col-md-2"><p class="lead">${artist.name}</p></div>
				<div class="col-md-2">
					<form method="post" action="ArtistExamine">
						<button type="submit" name="Artist name" class="btn btn-primary"
						value="${artist.id}">Select Artist</button>
					</form>
				</div>
			</div>
		</c:forEach>	
		
	</div>


</body>
</html>