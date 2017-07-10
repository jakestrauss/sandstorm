<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
 		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
		td
		{
    		padding:0 5px 0 5px;
		}
</style>
    </head>
    <body>
    	<jsp:include page="Header.jsp" />
    	<c:if test="${empty sandstorm}">
	    	<h1>sandstorm</h1>
	    	<h3>Choose songs to add to a playlist to sandstorm</h3>
	    	<br>
	    	<table>
	    		<tr>
					<th>Search for song</th>
					<th>Search for artist</th>
					<th>Search for album</th>
				</tr>
				
				<tr>
		    		<td class="paddingBetweenCols">
		        		<form method="post" action="SongSearcher">
		        			<div>
		        				<input type = "text" name="Song name"><br>
		        				<input type = "submit" value="Search">
		        			</div>
		        		</form>
		        	</td>
	        	
		        	<td class="paddingBetweenCols">
		        		<form method="post" action="ArtistSearcher">
		        			<div>
		        				<input type = "text" name="Artist name"><br>
		        				<input type = "submit" value="Search">
		        			</div>
		        		</form>
		        	</td>
	        	
		        	<td class="paddingBetweenCols">
		        		<form method="post" action="AlbumSearcher">
		        			<div>
		        				<input type = "text" name="Album name"><br>
		        				<input type = "submit" value="Search">
		        			</div>
		        		</form>
		        	</td>
		        </tr>
	       </table>
		</c:if>
		
		<c:if test="${not empty sandstorm}">
			<h3><font color="#BCB028">Your playlist has been successfully 
			sandstormed! Would you like to:</font></h3>
			<table>
				<tr>
					<td>
						<form method="post" action="ExportToSpotify">
							<button type="submit"><font color="#BCB028">Add this playlist to 
							your Spotify account</font></button>
						</form>
					</td>
					<td><font color="#BCB028">or</font></td>
					<td>
						<form method="post" action="StartOver">
							<button type="submit"><font color="#BCB028">Start a new playlist</font></button>
						</form>
					</td>
				</tr>
			</table>
			
		</c:if>

        
    </body>
</html>
