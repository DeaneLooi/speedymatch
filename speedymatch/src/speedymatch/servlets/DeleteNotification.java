package speedymatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(content.equals(NotificationVariables.ALERT)){
			
		}
		
		else if(content.equals(NotificationVariables.CINEMA)){
			NotificationDAO.deleteNotification(CinemaForm.n);
		}
		
		else if(content.equals(NotificationVariables.FRIEND)){
			
		}
		
		else if(content.equals(NotificationVariables.VIDEOCONF)){
			String sender=request.getParameter("sender");
			String receiver=request.getParameter("receiver");
			System.out.println("Deleting vid conf notification: "+sender+" "+receiver);
			//NotificationDAO.deleteNotification();
		}
		
		else if(content.equals(NotificationVariables.MESSAGE)){
			
		}
		
		response.sendRedirect("pages/notifications.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
