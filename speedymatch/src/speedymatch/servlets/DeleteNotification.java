package speedymatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Notification;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;

/**
 * Servlet implementation class DeleteNotifications
 */
@WebServlet("/DeleteNotification")
public class DeleteNotification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteNotification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		String content = (String)request.getParameter("content");
		String sender = (String)request.getParameter("sender");
		String receiver = (String)request.getParameter("receiver");
		
		if(content.equals(NotificationVariables.ALERT)){
			Notification delete = new Notification(sender,receiver,NotificationVariables.ALERT);
			NotificationDAO.deleteNotification(delete);
		}
		
		else if(content.equals(NotificationVariables.CINEMA)){
			Notification delete = new Notification(sender,receiver,NotificationVariables.CINEMA);
			NotificationDAO.deleteNotification(delete);
		}
		
		else if(content.equals(NotificationVariables.FRIEND)){
			System.out.println("deleted friend request from : "+sender);
			Notification delete = new Notification(sender,receiver,NotificationVariables.FRIEND);
			NotificationDAO.deleteNotification(delete);
		}
		
		else if(content.equals(NotificationVariables.VIDEOCONF)){
			System.out.println("Deleting vid conf notification: "+sender+" "+receiver);
			Notification deleted = new Notification(sender,receiver,NotificationVariables.VIDEOCONF);
			NotificationDAO.deleteNotification(deleted);
		}
		
		else if(content.equals(NotificationVariables.MESSAGE)){
			System.out.println("message notification has been deleted from: "+sender);
			Notification msgDeleted = new Notification(sender,receiver,NotificationVariables.MESSAGE);
			NotificationDAO.deleteNotification(msgDeleted);
		}
		
		else if (content.equals(NotificationVariables.VIDEOCONFRDY)){
			System.out.println("Updating vid conf notification: "+sender+" "+receiver);
			Notification deleted = new Notification(sender,receiver,NotificationVariables.VIDEOCONF);
			NotificationDAO.deleteNotification(deleted);
			Notification vidconfrdy = new Notification(sender,receiver,NotificationVariables.VIDEOCONFRDY);
			NotificationDAO.createNotification(vidconfrdy);
			System.out.println("Ready for vid: "+sender+" "+receiver);
			response.sendRedirect("pages/VidConIFrame.jsp");
		}
		
		if (!content.equals(NotificationVariables.VIDEOCONFRDY)){
		response.sendRedirect("pages/notifications.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
