package com.straussj.sandstorm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveSongFromPlaylist
 */
public class RemoveSongFromPlaylist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveSongFromPlaylist() {
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
		final LocalPlaylist playlist = (LocalPlaylist) request.getSession().getAttribute("playlist");
		int ind = Integer.parseInt(request.getParameter("Song index"));
		playlist.removeTrack(ind);
		request.getSession().setAttribute("playlist", playlist);
		response.sendRedirect((String) request.getSession().getAttribute("currentPage"));
	}

}
