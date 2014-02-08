package speedymatch.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;








import speedymatch.entities.Member;
import speedymatch.entities.Notification;
import speedymatch.entities.Sessions;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;

/**
 * Servlet implementation class VidChat
 */
@WebServlet("/VidChat")
public class VidChat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VidChat() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {;
		//See if user online or not
		HttpSession existingHttpSession = request.getSession();
		Member existingClient = (Member)existingHttpSession.getAttribute("Member");
		//if (existingClient!=null){
			Sessions existingSessions = new Sessions(existingHttpSession.getId(), existingClient.getUsername());
			Set sessionArray = (Set) getServletContext().getAttribute("speedymatch.sessions");
			Iterator sessionIt = sessionArray.iterator();
					while(sessionIt.hasNext()) {
					Sessions sess = (Sessions)sessionIt.next();
					System.out.println("Client id ="+sess.getClientId());
//					if(sess.getClientId().equals(existingClient.getUsername()) && !sess.getSessionId().equals(existingHttpSession.getId())){
//						Object obj = new Object();
//						obj = "<p style='color:red'>*Your account is already logged in</p>";
//						request.setAttribute("loginResult", obj);
//						FileMethods.fileDelete(image);
//						request.getRequestDispatcher("templateLogin.jsp").forward(request, response);
//						return;
//						
//					}
//					
//					else if(sess.getClientId().equals(existingClient.getUsername()) && sess.getSessionId().equals(existingHttpSession.getId())){
//						request.getRequestDispatcher("secured/templateNewHome.jsp").forward(request, response);
//						return;
//						}
					}
		//}
	
		String sender = request.getParameter("sender");
		String receiver = request.getParameter("receiver");
		System.out.println("Sender = "+sender+" Receiver = "+receiver);
		///finding whether it accept liao or not
		Notification n = new Notification(sender,receiver,NotificationVariables.VIDEOCONFRDY);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		if (false) // receiver online and accept
		{
			Notification oldNote = new Notification(sender, receiver,NotificationVariables.VIDEOCONFRDY);
			NotificationDAO.deleteNotification(oldNote);
			System.out.println("Deleted notification");
			//response.sendRedirect("pages/VidConIFrame.jsp");
			
		}
		else {
		Notification newNote = new Notification(sender,receiver,NotificationVariables.VIDEOCONF);
		NotificationDAO.createNotification(newNote);
		//Alert msg for successful requesting
		Object obj = new Object();
		obj="<script>alert('Request Successful')</script>";
		request.getSession().setAttribute("alert",obj);
		response.sendRedirect("pages/profile.jsp?");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
