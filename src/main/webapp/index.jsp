<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    	<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
 		<!-- Bootstrap -->
    	<link href="css/bootstrap.min.css" rel="stylesheet">
        <title>sandstorm home</title>
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
	    	<h1 style="font-family:Condiment; margin-left:15px">sandstorm</h1>
	    	<h3 style="margin-left:15px">Choose songs to add to a playlist to sandstorm</h3>
	    	<br>
	    	<div class="container-fluid">
				
				<div class="row">
					<form method="post" action="SongSearcher">
			    		<div class="col-md-3 form-group">
			    			<label for="Song name">Search for song</label>
			    			<input type="text" class="form-control" name="Song name" placeholder="Song name">
			        		<button type="submit" class="btn btn-primary">Search</button>
			        	</div>
		        	</form>
	        	
	        		<form method="post" action="ArtistSearcher">
		        		<div class="col-md-3 form-group">
			    			<label for="Artist name">Search for artist</label>
			    			<input type="text" class="form-control" name="Artist name" placeholder="Artist name">
			        		<button type="submit" class="btn btn-primary">Search</button>
			        	</div>
		        	</form>
	        	
		        	<form method="post" action="AlbumSearcher">
		        		<div class="col-md-3 form-group">
			    			<label for="Album name">Search for album</label>
			    			<input type="text" class="form-control" name="Album name" placeholder="Album name">
			        		<button type="submit" class="btn btn-primary">Search</button>
			        	</div>
		        	</form>
		        </div>
	       </div>
		</c:if>
		
		<c:if test="${not empty sandstorm}">
			<audio autoplay>
				<source src="sandstorm.mp3" type="audio/mpeg">
			</audio>
			<h3 style="margin-left:10px">Your playlist has been successfully 
			sandstormed! Would you like to:</h3>
			<div class="container" style="margin-left:10px; margin-bottom:20px">
				<div class="row">
					<div class="col-md-4">
						<form method="post" action="ExportToSpotify">
							<button type="submit" class="btn btn-warning">Add this playlist to 
							your Spotify account</button>
						</form>
					</div>
					<div class="col-md-1">
						<p class="lead">or</p>
					</div>
					<div class="col-md-2">
						<form method="post" action="StartOver">
							<button type="submit" class="btn btn-warning">Start a new playlist</button>
						</form>
					</div>
				</div>
			</div>
			
		</c:if>

        
    </body>
</html>
