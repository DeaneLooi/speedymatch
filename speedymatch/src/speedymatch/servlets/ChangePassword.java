package speedymatch.servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Member;
import speedymatch.entities.dao.MemberDAO;
import speedymatch.utils.Algorithms;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
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
		// TODO Auto-generated method stub
		Member member = (Member)request.getSession().getAttribute("member");
		String oldPass = (String)request.getParameter("oldPass");
		String newPass = (String)request.getParameter("newPass");
		String confirmPass = (String)request.getParameter("confirmPass");
		try {
			if(Algorithms.getHash(oldPass, member.getMemberSecurity().getSalt()).equals(member.getPasswd())){
				
				if(newPass.equals(confirmPass)){
					member.setPasswd(Algorithms.getHash(newPass,member.getMemberSecurity().getSalt()));
					MemberDAO.changePassword(member);
					
					Object obj = new Object();
					obj = "<p style='color:red'>*Passwords successfully changed";
					request.getSession().setAttribute("chgPassObj", obj);
					response.sendRedirect("pages/changePassword.jsp");
				}
				
				else{
					
					Object obj = new Object();
					obj = "<p style='color:red'>*Passwords do not match";
					request.getSession().setAttribute("chgPassObj", obj);
					response.sendRedirect("pages/changePassword.jsp");
				}
			}
			
			else{
				
				Object obj = new Object();
				obj = "<p style='color:red'>*Password is not correct";
				request.getSession().setAttribute("chgPassObj", obj);
				response.sendRedirect("pages/changePassword.jsp");
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		
		
	}

}
