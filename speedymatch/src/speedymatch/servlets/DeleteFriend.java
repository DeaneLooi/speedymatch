package speedymatch.servlets;

import java.io.IOException;
import java.util.ArrayList;

import speedymatch.entities.FriendList;
import speedymatch.entities.Member;
import speedymatch.entities.Notification;
import speedymatch.entities.dao.FriendListDAO;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;

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
		
		//Check if user is online
		Member m = (Member)request.getSession().getAttribute("member");
		String sender = m.getUsername();
		
		String friendId = request.getParameter("friendId");
		FriendList f = new FriendList(sender);
		FriendListDAO.deleteFriends(f, friendId);
		
		//See notification
		String receiver = (String)request.getParameter("receiver");
				
		Notification n = new Notification(sender, receiver, NotificationVariables.FRIEND);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		Notification nn = new Notification(sender,receiver,NotificationVariables.FRIEND);
		NotificationDAO.createNotification(nn);
		
		//alert that notification has been sent
		Object alert = new Object();
		alert="<script>alert('Request Sent')</script>";
		request.getSession().setAttribute("alert", alert);
		
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

