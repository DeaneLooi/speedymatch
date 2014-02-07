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
		
		response.setContentType("text/xml");
	    response.setHeader("Cache-Control", "no-cache");
	    
		Member m = (Member) request.getSession().getAttribute("member");
		Notification n = new Notification(null,m.getUsername(),null);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		for (int i=0; i<notifications.size(); i++){
		System.out.println("retrieved notification = "+notifications.get(i).getSender());
		System.out.println(notifications.get(i).getReceiver());
		System.out.println(notifications.get(i).getNotification());
		}
		PrintWriter writer = response.getWriter();
		
		String html = "";		
		
		for(int i=0; i<notifications.size();i++){
			Notification n1 = notifications.get(i);
			
			if(n1.getNotification().equals(NotificationVariables.ALERT)){
				html+="<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html+="<p>"+n1.getSender()+" has visited your profile&nbsp;<a href='../DeleteNotification?content=Alert'>&#x2717</a></p>";
				html+="</div>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.CINEMA)){
				html+="<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html+="<p>"+n1.getSender()+" has invited you to watch a movie</p>";
				html+="<a href='../Cinema'>Accept</a>&nbsp;";
				html+="<a href='../DeleteNotification?content=Cinema'>Reject</a>";
				html+="</div>";
				
			}
			
			else if(n1.getNotification().equals(NotificationVariables.FRIEND)){
				
				html+="<p>"+n1.getSender()+" has requested to be your friend</p>";
			}
			
			else if(n1.getNotification().equals(NotificationVariables.VIDEOCONF)){
				System.out.println("Showing vidconf notofication.");
				html+="<div style='background-color:lightgray;border-style:solid;border-color:white;border-width:1px;padding:5px'>";
				html+="<p>"+n1.getSender()+" has invited you to a video chat</p>";
				html+="<a href='../'>Accept</a>&nbsp;";
				html+="<a href='../DeleteNotification?content=VIDEOCONF'>Reject</a>";
				html+="</div>";		
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
