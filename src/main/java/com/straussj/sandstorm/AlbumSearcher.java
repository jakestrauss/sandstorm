package com.straussj.sandstorm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import com.wrapper.spotify.Api;
import com.wrapper.spotify.methods.AlbumRequest;
import com.wrapper.spotify.methods.AlbumSearchRequest;
import com.wrapper.spotify.methods.authentication.ClientCredentialsGrantRequest;
import com.wrapper.spotify.models.Album;
import com.wrapper.spotify.models.ClientCredentials;
import com.wrapper.spotify.models.Page;
import com.wrapper.spotify.models.SimpleAlbum;

/**
 * Servlet implementation class ArtistSearcher
 */
public class AlbumSearcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlbumSearcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//first get authorization details worked out
		
		// configure api
		final String clientId = "03f02ed981ec452aaaba403ae35cfca1";
		final String clientSecret = "5d74bd30f6094346ab30365a65605a02";
		final Api api = Api.builder().clientId(clientId).clientSecret(clientSecret).build();

		final ClientCredentialsGrantRequest clientRequest = api.clientCredentialsGrant().build();
		final SettableFuture<ClientCredentials> responseFuture = clientRequest.getAsync();

		/* Add callbacks to handle success and failure */
		Futures.addCallback(responseFuture, new FutureCallback<ClientCredentials>() {
			public void onSuccess(ClientCredentials clientCredentials) {
				/* The tokens were retrieved successfully! */
				System.out.println("Successfully retrieved an access token! " + clientCredentials.getAccessToken());
				System.out.println("The access token expires in " + clientCredentials.getExpiresIn() + " seconds");

				/*
				 * Set access token on the Api object so that it's used going
				 * forward
				 */
				api.setAccessToken(clientCredentials.getAccessToken());

				/*
				 * Please note that this flow does not return a refresh token.
				 * That's only for the Authorization code flow
				 */
			}

			public void onFailure(Throwable throwable) {
				/*
				 * An error occurred while getting the access token. This is
				 * probably caused by the client id or client secret is invalid.
				 */
			}
		});

		
		//search for artist
		System.out.println(request.getParameter("Album name"));
		AlbumSearchRequest albumRequest = api.searchAlbums(request.getParameter("Album name")).market("US").limit(5).build();
		try {
			final Page<SimpleAlbum> albumSearchResult = albumRequest.get();
			final List<SimpleAlbum> simpleAlbums = albumSearchResult.getItems();
			final List<Album> albums = new ArrayList<Album>();
			for (SimpleAlbum a : simpleAlbums) {
				AlbumRequest aRequest = api.getAlbum(a.getId()).build();
				Album aAlbum = aRequest.get();
				albums.add(aAlbum);
			}
			
			request.getSession().setAttribute("albums", albums);
			request.getSession().setAttribute("currentPage", "AlbumSearchReturn.jsp");
			response.sendRedirect("AlbumSearchReturn.jsp");
		} catch (Exception e) {
			response.sendRedirect("Error.jsp");
		}
	}

}

