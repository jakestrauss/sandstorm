package com.straussj.sandstorm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Track;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import com.wrapper.spotify.Api;
import com.wrapper.spotify.methods.TrackSearchRequest;
import com.wrapper.spotify.methods.authentication.ClientCredentialsGrantRequest;
import com.wrapper.spotify.models.ClientCredentials;
import com.wrapper.spotify.models.Page;

/**
 * Servlet implementation class SongSearcher
 */
public class SongSearcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SongSearcher() {
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
		// configure api
		final String clientId = "521ecc79d9f74c358a699843edf026e4";
		final String clientSecret = "cbac7aa2600f4fadaf7704103796efc4";
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

		TrackSearchRequest songRequest = api.searchTracks(request.getParameter("Song name")).market("US").build();
		try {
			final Page<com.wrapper.spotify.models.Track> trackSearchResult = songRequest.get();
			int numResults = trackSearchResult.getTotal();
			request.getSession().setAttribute("numResults", numResults);
			
			response.sendRedirect("SongSearchReturn.jsp");
		} catch (Exception e) {
			int numResults = 0;
			request.getSession().setAttribute("numResults", numResults);
			response.sendRedirect("SongSearchReturn.jsp");
		}
	}

}