package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Member;
import speedymatch.entities.Notification;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;

/**
 * Servlet implementation class GetNotifications
 */
@WebServlet("/GetNotifications")
public class GetNotifications extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetNotifications() {
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

		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");

		Member m = (Member) request.getSession().getAttribute("member");
		Notification n = new Notification(null, m.getUsername(), null);
		ArrayList<Notification> notifications = NotificationDAO
				.retrieveNotifications(n);

		for (int i = 0; i < notifications.size(); i++) {
			System.out.println("retrieved notification = "+notifications.get(i).getSender()+" "+notifications.get(i).getReceiver()+" "+notifications.get(i).getNotification());
		}
		PrintWriter writer = response.getWriter();

		String html = "";

		for (int i = 0; i < notifications.size(); i++) {
			Notification n1 = notifications.get(i);

			if (n1.getNotification().equals(NotificationVariables.ALERT)) {
				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>"
						+ n1.getSender()
						+ " has visited your profile&nbsp;<a href='../DeleteNotification?content=Alert'>&#x2717</a></p>";
				html += "</div>";
			}

			else if (n1.getNotification().equals(NotificationVariables.CINEMA)) {
				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>" + n1.getSender()
						+ " has invited you to watch a movie</p>";
				html += "<a href='../CinemaForm?content="+NotificationVariables.CINEMA+"&sender="+n1.getSender()+"&receiver="+n1.getReceiver()+"'>Accept</a>&nbsp;";
				html += "<a href='../DeleteNotification?content="+NotificationVariables.CINEMA+"&sender="+n1.getSender()+"&receiver="+n1.getReceiver()+"'>Reject</a>";
				html += "</div>";

			}
			
			else if(n1.getNotification().equals(NotificationVariables.CINEMAACCEPT)){
				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>" + n1.getSender()
						+ " has accepted your invite to watch a movie&nbsp;<a href='../CinemaForm?content="+NotificationVariables.CINEMAACCEPT+"&sender="+n1.getSender()+"&receiver="+n1.getReceiver()+"'>&#10004</a>&nbsp;</p>";
				html += "</div>";
			}

			else if (n1.getNotification().equals(NotificationVariables.FRIEND)) {
				System.out.println("add friendNotification has appear");
				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>" + n1.getSender()
						+ " has requested to be your friend</p>";
				html += "<a href='../AddFriend'>Accept</a>&nbsp;";
				html += "<a href='../DeleteNotification?content="
						+ NotificationVariables.FRIEND + "&sender="
						+ n1.getSender() + "&receiver=" + n1.getReceiver()
						+ "'>Reject</a>";
				html += "</div>";
			}

				else if (n1.getNotification().equals(NotificationVariables.DELETEFRIEND)) {
					 				System.out.println("deleteFriendNotification has appear");
					 				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
					 				html += "<p>" + n1.getSender()
					 						+ " has delete you as a friend</p>";
					 				html += "<a href='../DeleteNotification?content="
					 						+ NotificationVariables.DELETEFRIEND + "&sender="
					 						+ n1.getSender() + "&receiver=" + n1.getReceiver()
					 						+ "'>OK</a>";
					 				html += "</div>";
			}
			
			else if (n1.getNotification().equals(
					NotificationVariables.VIDEOCONF)) {

				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>" + n1.getSender()
						+ " has invited you to a video chat</p>";
				html += "<a href='../DeleteNotification?content="
						+ NotificationVariables.VIDEOCONFRDY + "&sender="
						+ n1.getSender() + "&receiver=" + n1.getReceiver()
						+ "'>Accept</a>&nbsp;";
				html += "<a href='../DeleteNotification?content="
						+ NotificationVariables.VIDEOCONF + "&sender="
						+ n1.getSender() + "&receiver=" + n1.getReceiver()
						+ "'>Reject</a>";
				html += "</div>";

				html+="<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html+="<p>"+n1.getSender()+" has invited you to a video chat</p>";
				html+="<a href='../DeleteNotification?content="+NotificationVariables.VIDEOCONFRDY+"&sender="+n1.getSender()+"&receiver="+n1.getReceiver()+"'>Accept</a>&nbsp;";
				html+="<a href='../DeleteNotification?content="+NotificationVariables.VIDEOCONF+"&sender="+n1.getSender()+"&receiver="+n1.getReceiver()+"'>Reject</a>";
				html+="</div>";		

			}

			else if (n1.getNotification().equals(NotificationVariables.MESSAGE)) {
				System.out.println("add messageNotification has appear");
				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html += "<p>" + n1.getSender() + " just messaged you</p>";
				html += "<a href='../AddFriend'>Accept</a>&nbsp;";
				html += "<a href='../DeleteNotification?content="
						+ NotificationVariables.MESSAGE + "&sender="
						+ n1.getSender() + "&receiver=" + n1.getReceiver()
						+ "'>Reject</a>";
				html += "</div>";
			}

			else if (n1.getNotification().equals(NotificationVariables.MESSAGE)) {
				 				System.out.println("add messageNotification has appear");
				 				html += "<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				 				html += "<p>" + n1.getSender() + " just messaged you</p>";
				 				html += "<a href='../AddFriend'>Accept</a>&nbsp;";
				 				html += "<a href='../DeleteNotification?content="
				 						+ NotificationVariables.MESSAGE + "&sender="
				 						+ n1.getSender() + "&receiver=" + n1.getReceiver()
				 						+ "'>Reject</a>";
				 				html += "</div>";
				  			}
			
		}

		writer.println(html);

		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
