package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.*;
import speedymatch.entities.dao.AdminSearchDAO;
import speedymatch.entities.dao.MemberDAO;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Member profile = null;
			if (AdminSearchDAO.advanceSearch(profile) != null) {
				String gender = request.getParameter("gen");
				String smoking = request.getParameter("smoke");
				String drinking = request.getParameter("drink");
				String relaStatus = request.getParameter("Status");
				String child = request.getParameter("child");
				String education = request.getParameter("edu");
				String zodic = request.getParameter("zodiac");
				String occ = request.getParameter("occ");

				PrintWriter out = null;
				out.println(gender + " " + smoking + " " + drinking + " "
						+ relaStatus + " " + child + " " + education + " "
						+ zodic + " " + occ + " ");

			}/*
			 * else{ response.sendRedirect("pages/error.jsp"); }
			 */
			profile = AdminSearchDAO.advanceSearch(profile);
			request.getSession().setAttribute("piList", profile);
			response.sendRedirect("pages/searchResult.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
