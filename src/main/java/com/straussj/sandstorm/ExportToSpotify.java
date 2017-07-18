package com.straussj.sandstorm;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wrapper.spotify.Api;

/**
 * Servlet implementation class ExportToSpotify
 */
public class ExportToSpotify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExportToSpotify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean heroku = false;
		String redirectURI = heroku ? 
				"https://sandstorm-by-jake-strauss.herokuapp.com/callback.jsp" : 
				"http:localhost:8080/sandstorm/callback.jsp";
		Api api = Api.builder()
				  .clientId("03f02ed981ec452aaaba403ae35cfca1")
				  .clientSecret("5d74bd30f6094346ab30365a65605a02")
				  .redirectURI(redirectURI)
				  .build();
		
		/* Set the necessary scopes that the application will need from the user */
		final List<String> scopes = Arrays.asList("user-modify-private", "playlist-modify-public", "user-read-private",
				"user-read-email");

		/* Set a state. This is used to prevent cross site request forgeries. */
		final String state = "someExpectedStateString";
		String authorizeURL = api.createAuthorizeURL(scopes, state);
		request.getSession().setAttribute("api", api);
		response.sendRedirect(authorizeURL);
	}

}
