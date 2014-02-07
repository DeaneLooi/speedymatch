package speedymatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import speedymatch.entities.Notification;
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
		String sender = request.getParameter("sender");
		String receiver = request.getParameter("receiver");
		System.out.println("Sender = "+sender+" Receiver = "+receiver);
	
		if (false) // receiver online and accept
		{
			Notification oldNote = new Notification(sender, receiver,NotificationVariables.VIDEOCONF);
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
