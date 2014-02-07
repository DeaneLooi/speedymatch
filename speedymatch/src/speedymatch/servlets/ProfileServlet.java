package speedymatch.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.*;
import speedymatch.entities.dao.*;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProfileServlet() {
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

		/*
		 * Profile profile = new Profile(username); profile =
		 * ProfileDAO.retrieveProfile(profile);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		String dob = (String) request.getParameter("dob");
		Scanner sc = new Scanner(dob);
		sc.useDelimiter("-");
		int year = Integer.parseInt(sc.next());
		int month = Integer.parseInt(sc.next());
		int day = Integer.parseInt(sc.next());
		Date dateOB = new Date(year - 1900, month - 1, day);
		sc.close();

		String gender = request.getParameter("gender");
		String child = request.getParameter("child");
		String smoking = request.getParameter("smoking");
		String drinking = request.getParameter("drinking");
		String relaStatus = request.getParameter("relaStatus");
		String eduLevel = request.getParameter("eduLevel");
		String race = request.getParameter("race");
		String hobby = request.getParameter("hobby");
		String religion = request.getParameter("religion");
		String occupation = request.getParameter("occupation");
		String horo = request.getParameter("horo");

		Profile profile = new Profile(username, Integer.parseInt(age), gender,
				eduLevel, hobby, Integer.parseInt(height),
				Integer.parseInt(weight), race, religion, child, horo,
				occupation, smoking, drinking, relaStatus);
		Member member = new Member(username, email, fname, lname, dateOB);

		ProfileDAO.updateProfile(profile);
		MemberDAO.updateMember(member);

		response.sendRedirect("pages/profile.jsp");
	}
}
