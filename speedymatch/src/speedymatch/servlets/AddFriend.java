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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddFriend")
public class AddFriend extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public AddFriend() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Check if user is online
		HttpSession friendOnline = request.getSession();
		Member friendOnline2 = (Member)friendOnline.getAttribute("member");
		
		String username = request.getParameter("username");
		String friendId = request.getParameter("friendId");
		FriendList f = new FriendList(username);
		FriendListDAO.addFriends(f, friendId);
		
		//See notification
		String sender = (String)request.getParameter("sender");
		String receiver = (String)request.getParameter("receiver");
		
		Notification n = new Notification(sender, receiver, NotificationVariables.FRIEND);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		//user online
		if(friendOnline2 != null) {
			try {
			Notification nn = new Notification(sender,receiver,NotificationVariables.FRIEND);
			NotificationDAO.createNotification(nn);
			
			//alert that notification has been sent
			Object alert = new Object();
			alert="<script>alert('Reqeuest Sent')</script>";
			request.getSession().setAttribute("alert", alert);
			response.sendRedirect("pages/friendProfile.jsp?username="+friendId);

			} catch(Exception e){
				System.out.println("Error has occured!= " + e);
			}
		}
		
		//user offline
		else {
			try{
			Notification on = new Notification(sender,receiver,NotificationVariables.FRIEND);
			NotificationDAO.deleteNotification(on);
			System.out.println("Delete notification");
			response.sendRedirect("pages/profile.jsp?");
			} catch (Exception ex) {
				System.out.println("Error has occured!= " + ex);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/xml");
	response.setHeader("Cache-Control", "no-cache");
	
	}
	
}

