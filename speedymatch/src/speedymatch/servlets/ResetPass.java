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
import speedymatch.utils.EmailSender;
import speedymatch.utils.RandomStringGenerator;

/**
 * Servlet implementation class ResetPass
 */
@WebServlet("/ResetPass")
public class ResetPass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetPass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//String activation = MemberDAO
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		Member member = new Member(username, null);
		member = MemberDAO.retrieveAccount(member);
		
		try {
		String dbEmail = Algorithms.decrypt(member.getEmail(), member.getMemberSecurity().getSalt());
		member.setEmail(dbEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(email.equalsIgnoreCase(member.getEmail())){
			String password = RandomStringGenerator.getRandomString(10);
			try {
				member.setPasswd(Algorithms.getHash(password, member.getMemberSecurity().getSalt()));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			String oldPass = MemberDAO.changePassword(member);
			EmailSender es = new EmailSender(member);
			es.sendResetPattern(password, oldPass);
			
			
			Object obj = new Object();
			obj = "<p style='color:red'>*Password has been sent to your email";
			request.getSession().setAttribute("loginObj", obj);
			response.sendRedirect("login.jsp");
		}
		
		else{
			
			Object obj = new Object();
			obj = "<p style='color:red'>*Wrong email and username combination";
			request.getSession().setAttribute("loginObj", obj);
			response.sendRedirect("forgotPass.jsp");
		}

	}

}
