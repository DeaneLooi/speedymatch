package speedymatch.servlets;

import java.io.IOException;

import speedymatch.entities.FriendList;
import speedymatch.entities.dao.FriendListDAO;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteFriend")
public class DeleteFriend extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public DeleteFriend() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String friendId = request.getParameter("friendId");
		FriendList f = new FriendList(username);
		FriendListDAO.deleteFriends(f, friendId);
		
		response.sendRedirect("pages/friendProfile.jsp?username="+friendId);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/xml");
	response.setHeader("Cache-Control", "no-cache");


	}
	
}

