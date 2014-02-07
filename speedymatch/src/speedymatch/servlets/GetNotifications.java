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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("N...");
		response.setContentType("text/xml");
	    response.setHeader("Cache-Control", "no-cache");
	    
		Member m = (Member) request.getSession().getAttribute("member");
		Notification n = new Notification(null,m.getUsername(),null);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		PrintWriter writer = response.getWriter();
		
		String html = "";		
		
		for(int i=0; i<notifications.size();i++){
			Notification n1 = notifications.get(i);
			
			if(n1.getNotification().equals(NotificationVariables.ALERT)){
				html+="<p>"+n1.getSender()+" has visited your profile</p>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.CINEMA)){
				html+="<p>"+n1.getSender()+" has invited you to watch a movie</p>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.FRIEND)){
				html+="<p>"+n1.getSender()+" has requested to be your friend</p>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.VIDEOCONF)){
				html+="<p>"+n1.getSender()+" has invited you to a video chat</p>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.MESSAGE)){
				html+="<p>"+n1.getSender()+" just messaged you</p>";
			}
			
		}
		
		
		writer.println(html);
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
