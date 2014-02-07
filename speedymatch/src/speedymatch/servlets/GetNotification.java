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
 * Servlet implementation class GetNotification
 */
@WebServlet("/GetNotification")
public class GetNotification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetNotification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
			System.out.println("S..");
			
			response.setContentType("text/xml");
		    response.setHeader("Cache-Control", "no-cache");
		    
			Member m = (Member) request.getSession().getAttribute("member");
			Notification n = new Notification(null,m.getUsername(),null);
			ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
/*			int notificationCount = 0;
			for(int i=0; i<notifications.size();i++){
				Notification notification = notifications.get(i);
				
				if(notification.getNotification().equals(NotificationVariables.ALERT)){
					notificationCount +=1;
				}
				
				else if(notification.getNotification().equals(NotificationVariables.CINEMA)){
					notificationCount +=1;
				}
				
				else if(notification.getNotification().equals(NotificationVariables.FRIEND)){
					notificationCount +=1;
				}
				
				else if(notification.getNotification().equals(NotificationVariables.VIDEOCONF)){
					notificationCount +=1;
				}
				
				else if(notification.getNotification().equals(NotificationVariables.MESSAGE)){
					notificationCount +=1;
				}
				
			}
			*/
			
			PrintWriter writer = response.getWriter();
			
			String html = "";		
			int notificationCount = notifications.size();
			
			if(notificationCount==0){
				html="";
			}
			
			else{
				html+=notificationCount;
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
