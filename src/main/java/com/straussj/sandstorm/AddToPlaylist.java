package com.straussj.sandstorm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import com.wrapper.spotify.Api;
import com.wrapper.spotify.exceptions.WebApiException;
import com.wrapper.spotify.methods.TrackRequest;
import com.wrapper.spotify.methods.authentication.ClientCredentialsGrantRequest;
import com.wrapper.spotify.models.ClientCredentials;
import com.wrapper.spotify.models.Track;
import com.straussj.sandstorm.LocalPlaylist;
/**
 * Servlet implementation class ArtistSearcher
 */
public class AddToPlaylist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToPlaylist() {
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

		// first get authorization details worked out

		// configure api
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

		// check to see if playlist has already been created
		if (request.getSession().getAttribute("playlist") != null) {
			TrackRequest tRequest = api.getTrack(request.getParameter("Song")).build();
			final LocalPlaylist playlist = (LocalPlaylist)request.getSession().getAttribute("playlist");
			try {
				playlist.addTrack(tRequest.get());
				request.getSession().setAttribute("playlist", playlist);
				response.sendRedirect("SongSearchReturn.jsp");
			} catch (WebApiException e) {
				response.sendRedirect("Error.jsp");
			}
		} else {
			TrackRequest tRequest = api.getTrack(request.getParameter("Song")).build();
			try {
				Track t = tRequest.get();
				final LocalPlaylist playlist = new LocalPlaylist(t);
				request.getSession().setAttribute("playlist", playlist);
				response.sendRedirect("SongSearchReturn.jsp");
			} catch (WebApiException e) {
				response.sendRedirect("Error.jsp");
			}
		}
	}

}