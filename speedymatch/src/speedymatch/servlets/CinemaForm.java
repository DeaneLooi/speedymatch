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
import speedymatch.entities.Movie;
import speedymatch.entities.Notification;
import speedymatch.entities.dao.MovieDAO;
import speedymatch.entities.dao.NotificationDAO;
import speedymatch.utils.NotificationVariables;

/**
 * Servlet implementation class CinemaForm
 */
@WebServlet("/CinemaForm")
public class CinemaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Notification n = null;
	private static Object obj;
	private static Object obj1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CinemaForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
/*		
		Set<HttpSession> activeUsers = (Set<HttpSession>)request.getSession().getServletContext().getAttribute("activeUsers");
		Iterator<HttpSession> it = activeUsers.iterator();
		HttpSession session = null;
		while(it.hasNext()){
			
			session = it.next();
			
			if(session.getId().equals(sessionID)){
				
				session.setAttribute("movieUrl", obj);
				session.setAttribute("movieType", obj1);
				HttpServletResponse sessionResponse;
			}
			
		}
		*/
		
		String content = (String)request.getParameter("content");
		String sender = (String)request.getParameter("sender");
		String receiver = (String)request.getParameter("receiver");
		
		if(content!=null){
			if(content.equals(NotificationVariables.CINEMA)){
				Notification n =  new Notification(sender,receiver,NotificationVariables.CINEMA);
				NotificationDAO.deleteNotification(n);
				
				n = new Notification(receiver,sender,NotificationVariables.CINEMAACCEPT);
				NotificationDAO.createNotification(n);
				request.getSession().setAttribute("movieUrl", obj);
				request.getSession().setAttribute("movieType", obj1);
				
				response.sendRedirect("pages/cinema.jsp");
			}
			
			else if(content.equals(NotificationVariables.CINEMAACCEPT)){
				Notification n =  new Notification(sender,receiver,NotificationVariables.CINEMAACCEPT);
				NotificationDAO.deleteNotification(n);
				
				request.getSession().setAttribute("movieUrl", obj);
				request.getSession().setAttribute("movieType", obj1);
				
				response.sendRedirect("pages/cinema.jsp");
			}
		}

		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Member member = (Member)request.getSession().getAttribute("member");
		String user = member.getUsername();
		String movie = request.getParameter("movie");
		String friend = request.getParameter("friend");
		String movieUrl = "";
		String movieType = "";
		ArrayList<Movie> movies = MovieDAO.retrieveMovies();

		
		for(int i=0; i< movies.size();i++){
			
			if(movies.get(i).getMovieId().equals(movie)){
				movieUrl = movies.get(i).getMovieUrl();
			}
		}
		
		movieType = movieUrl.substring(movieUrl.length()-3, movieUrl.length());
		obj = new Object();
		obj1 = new Object();
		obj = movieUrl;
		obj1 = movieType;
		Notification n = new Notification(user,friend,NotificationVariables.CINEMA);
		n = NotificationDAO.createNotification(n);
		if(n!=null){
			Object object = new Object();
			object = "<p'>You have invited "+friend+" to watch "+movie+".";
			request.getSession().setAttribute("movieObj", object);
			response.sendRedirect("pages/cinemaForm.jsp");
		}
		
		else{
			Object object = new Object();
			object = "<p'>There was an error in the form";
			request.getSession().setAttribute("movieObj", object);
			response.sendRedirect("pages/cinemaForm.jsp");
		}

		return;
		
		
	}

}
