package speedymatch.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
		String cpw = request.getParameter("cpw");

		Profile profile = new Profile(username, Integer.parseInt(age), gender,
				eduLevel, hobby, Integer.parseInt(height),
				Integer.parseInt(weight), race, religion, child, horo,
				occupation, smoking, drinking, relaStatus);
		Member member = new Member(username, email, fname, lname, dateOB);

		Connection currentCon = null;
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String dbName = "speedymatch";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "adming1vWayv";
		String password = "2MVCBKUIFISG";

		// Update Profile try 1
		try {
			Class.forName(driver).newInstance();
			currentCon = DriverManager.getConnection(url + dbName, userName,
					password);
			System.out.println("Connected!");
			String query = "UPDATE Profile SET age = ?, gender = ?, eduLevel = ?, hobby = ?, height = ?, weight = ?, race = ?, religion = ?, child = ?, horo = ?, occupation = ?, smoking = ?, drinking = ?, relaStatus = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setInt(1, profile.getAge());
			pstmt.setString(2, profile.getGender());
			pstmt.setString(3, profile.getEduLevel());
			pstmt.setString(4, profile.getHobby());
			pstmt.setInt(5, profile.getHeight());
			pstmt.setInt(6, profile.getWeight());
			pstmt.setString(7, profile.getRace());
			pstmt.setString(8, profile.getReligion());
			pstmt.setString(9, profile.getChild());
			pstmt.setString(10, profile.getHoro());
			pstmt.setString(11, profile.getOccupation());
			pstmt.setString(12, profile.getSmoking());
			pstmt.setString(13, profile.getDrinking());
			pstmt.setString(14, profile.getRelaStatus());
			pstmt.setString(15, profile.getUsername());

			pstmt.executeUpdate();

			System.out.println("Successfully updated profile!");

		} catch (Exception ex) {

			System.out
					.println("Update Profile failed: An Exception has occurred! "
							+ ex);
			profile = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		// update profile try 2
		try {
			Class.forName(driver).newInstance();
			currentCon = DriverManager.getConnection(url + dbName, userName,
					password);
			System.out.println("Connected!");
			String query = "UPDATE Profile SET age = ?, gender = ?, eduLevel = ?, hobby = ?, height = ?, weight = ?, race = ?, religion = ?, child = ?, horo = ?, occupation = ?, smoking = ?, drinking = ?, relaStatus = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(request.getParameter("age")));
			pstmt.setString(2, request.getParameter("gender"));
			pstmt.setString(3, request.getParameter("eduLevel"));
			pstmt.setString(4, request.getParameter("hobby"));
			pstmt.setInt(5, Integer.parseInt(request.getParameter("height")));
			pstmt.setInt(6, Integer.parseInt(request.getParameter("weight")));
			pstmt.setString(7, request.getParameter("race"));
			pstmt.setString(8, request.getParameter("religion"));
			pstmt.setString(9, request.getParameter("child"));
			pstmt.setString(10, request.getParameter("horo"));
			pstmt.setString(11, request.getParameter("occupation"));
			pstmt.setString(12, request.getParameter("smoking"));
			pstmt.setString(13, request.getParameter("drinking"));
			pstmt.setString(14, request.getParameter("relaStatus"));
			pstmt.setString(15, profile.getUsername());

			pstmt.executeUpdate();

			System.out.println("Successfully updated profile!");

		} catch (Exception ex) {

			System.out
					.println("Update Profile failed: An Exception has occurred! "
							+ ex);
			profile = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		// update member try 1
		try {
			Class.forName(driver).newInstance();
			java.sql.Date birthDate = new java.sql.Date(member.getDob()
					.getTime());
			currentCon = DriverManager.getConnection(url + dbName, userName,
					password);
			System.out.println("Connected!");
			String query = "UPDATE Member SET email = ?, Fname = ?, Lname = ?, dob = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, request.getParameter("email"));
			pstmt.setString(2, request.getParameter("fname"));
			pstmt.setString(3, request.getParameter("lname"));
			pstmt.setDate(4, birthDate);
			pstmt.setString(5, member.getUsername());

			pstmt.executeUpdate();

			System.out.println("Successfully updated member!");

		} catch (Exception ex) {

			System.out
					.println("Update Member failed: An Exception has occurred! "
							+ ex);
			member = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		// update member try 2
		try {
			Class.forName(driver).newInstance();
			java.sql.Date birthDate = new java.sql.Date(member.getDob()
					.getTime());
			currentCon = DriverManager.getConnection(url + dbName, userName,
					password);
			System.out.println("Connected!");
			String query = "UPDATE Member SET email = ?, Fname = ?, Lname = ?, dob = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getFname());
			pstmt.setString(3, member.getLname());
			pstmt.setDate(4, birthDate);
			pstmt.setString(5, member.getUsername());

			pstmt.executeUpdate();

			System.out.println("Successfully updated member!");

		} catch (Exception ex) {

			System.out
					.println("Update Member failed: An Exception has occurred! "
							+ ex);
			member = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		/*
		 * ProfileDAO.updateProfile(profile); MemberDAO.updateMember(member);
		 */

		/*
		 * member.setPasswd(cpw); MemberDAO.changePassword(member);
		 * MemberDAO.updateMember(member);
		 */

		response.sendRedirect("pages/profile.jsp");

		/*
		 * System.out .println(
		 * "<html><body><script>alert('Update successful!');</script></body></html>"
		 * );
		 */

	}
}
