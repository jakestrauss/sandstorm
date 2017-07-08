<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        
    </body>
</html>
