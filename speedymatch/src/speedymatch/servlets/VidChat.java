package speedymatch.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Notification;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;
import crossSiteScriptingOWASP.src.main.java.org.owasp.esapi.ESAPI;
import crossSiteScriptingOWASP.src.main.java.org.owasp.esapi.errors.EncodingException;

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
//		HttpSession existingHttpSession = request.getSession();
//		Member existingClient = (Member)existingHttpSession.getAttribute("Member");
//		//if (existingClient!=null){
//			Sessions existingSessions = new Sessions(existingHttpSession.getId(), existingClient.getUsername());
//			Set sessionArray = (Set) getServletContext().getAttribute("speedymatch.sessions");
//			Iterator sessionIt = sessionArray.iterator();
//					while(sessionIt.hasNext()) {
//					Sessions sess = (Sessions)sessionIt.next();
//					System.out.println("Client id ="+sess.getClientId());
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
//					}
		//}
	
		try {
			String safe = ESAPI.encoder().encodeForURL( request.getParameter( "sender" ) );
			String safe1 = ESAPI.encoder().encodeForURL( request.getParameter( "receiver" ) );
		} catch (EncodingException e) {
			Object obj = new Object();
			obj="<script>alert('Please try again.')</script>";
			request.getSession().setAttribute("alert",obj);
			response.sendRedirect("pages/profile.jsp");
		}
		
		String sender = request.getParameter("sender");
		String receiver = request.getParameter("receiver");
		boolean isValidURL = ESAPI.validator().isValidInput("URLContext", sender, "URL", 255, false); 
				 
		System.out.println("Sender = "+sender+" Receiver = "+receiver);
		
		///finding whether it accept liao or not
		Notification n = new Notification(sender,receiver,NotificationVariables.VIDEOCONFRDY);
		ArrayList<Notification> notifications = NotificationDAO.retrieveNotifications(n);
		
		if (!notifications.isEmpty()) // receiver accept?
		{
			if (isValidURL) {  
			
			for (int i=0; i<notifications.size(); i++){
				System.out.println("ready for vid conf: "+notifications.get(i).getSender()+" "+notifications.get(i).getReceiver());
				}
			Notification oldNote = new Notification(sender, receiver,NotificationVariables.VIDEOCONFRDY);
			NotificationDAO.deleteNotification(oldNote);
			System.out.println("Deleted vidchat notification cuz accepted liao");
			response.sendRedirect("pages/VidConIFrame.jsp");
			}
			else {
				Object obj = new Object();
				obj="<script>alert('Please try again.')</script>";
				request.getSession().setAttribute("alert",obj);
				response.sendRedirect("pages/profile.jsp");
			}
		}
		else {
			if (isValidURL) {
		Notification newNote = new Notification(sender,receiver,NotificationVariables.VIDEOCONF);
		NotificationDAO.createNotification(newNote);
//		//Alert msg for successful requesting
//		Object obj = new Object();
//		obj="<script>alert('Please wait for your partner.')</script>";
//		request.getSession().setAttribute("alert",obj);
		response.sendRedirect("pages/VidConIFrame.jsp");
			}
			else {
				Object obj = new Object();
				obj="<script>alert('Please try again.')</script>";
				request.getSession().setAttribute("alert",obj);
				response.sendRedirect("pages/profile.jsp");
			}
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
