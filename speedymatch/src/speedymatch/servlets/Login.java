package speedymatch.servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.dao.MemberDAO;
import speedymatch.utils.Algorithms;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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

		if (request.getParameter("username").isEmpty()) {
			Object obj = new Object();
			obj = "<p style='color:red'>*Please enter your username";
			request.getSession().setAttribute("loginObj", obj);
			response.sendRedirect("login.jsp");
		}

		else {
			String username = (String) request.getParameter("username");
			String passwd = (String) request.getParameter("password");

			Member member = new Member(username, passwd);
			member = MemberDAO.retrieveAccount(member);

			if (member == null) {
				Object obj = new Object();
				obj = "<p style='color:red'>*Username or password incorrect";
				request.getSession().setAttribute("loginObj", obj);
				response.sendRedirect("login.jsp");
			}

			else {

				MemberSecurity memSec = member.getMemberSecurity();

				try {
					passwd = Algorithms.getHash(passwd, memSec.getSalt());

					if (username.equalsIgnoreCase(member.getUsername())
							&& passwd.equals(member.getPasswd())) {

						String membership = memSec.getMembership();
						membership = Algorithms.decrypt(membership,
								memSec.getSalt());
						memSec.setMembership(membership);
						if (memSec.getMembership().equals("Admin")) {

							response.sendRedirect("admin/adminHomepage.jsp");

						}

						else if (memSec.getMembership().equals("normal")
								|| memSec.getMembership().equals("premium")) {

							request.getSession().setAttribute("member", member);

							response.sendRedirect("pages/profile.jsp");

						}

						else {
							Object obj = new Object();
							obj = "<p style='color:red'>*Please login again";
							request.getSession().setAttribute("loginObj", obj);
							response.sendRedirect("login.jsp");

						}

					}

					else {
						System.out
								.println("Username or password does not match");
						Object obj = new Object();
						obj = "<p style='color:red'>*Username or password incorrect";
						request.getSession().setAttribute("loginObj", obj);
						response.sendRedirect("login.jsp");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}
}
