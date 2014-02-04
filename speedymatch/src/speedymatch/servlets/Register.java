package speedymatch.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.dao.MemberDAO;
import speedymatch.utils.Algorithms;
import speedymatch.utils.RandomStringGenerator;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String salt = RandomStringGenerator.getRandomString(16);
		
		String username;
		try {
			username = (String)request.getParameter("username");
			String email = (String)request.getParameter("email");
			String passwd = (String)request.getParameter("password");
			String fName = (String)request.getParameter("fName");
			String lName = (String)request.getParameter("lName");
			String gender = (String)request.getParameter("gender");
			String dob = (String)request.getParameter("dob");
			Scanner sc = new Scanner(dob);
			sc.useDelimiter("-");
			int year = Integer.parseInt(sc.next());
			int month = Integer.parseInt(sc.next());
			int day = Integer.parseInt(sc.next());
			Date dateOB = new Date(year-1900,month-1,day);
			sc.close();
			String country = (String)request.getParameter("country");
			String city = (String)request.getParameter("city");
			String occupation = (String)request.getParameter("occupation");
			String memType = (String)request.getParameter("memType");
			String communication = (String)request.getParameter("comm");
			Date regDate = new Date();
			
			Member member = new Member(username, passwd, email, fName, lName, dateOB);
			MemberSecurity ms = new MemberSecurity(salt, null, memType, regDate, 'F', communication);
			
			Member registeredMember = MemberDAO.registerAccount(member, ms);
			
			if(registeredMember!=null){
				
				request.getSession().setAttribute("member", registeredMember);
				response.sendRedirect("pages/profile.jsp");
				
				
			}
			
			else{
				
				response.sendRedirect("pages/error.jsp");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}

}
