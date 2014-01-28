package speedymatch.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Movie;
import speedymatch.entities.dao.MovieDAO;

/**
 * Servlet implementation class CinemaForm
 */
@WebServlet("/CinemaForm")
public class CinemaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

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
		Object obj = new Object();
		Object obj1 = new Object();
		obj = movieUrl;
		obj1 = movieType;
		request.getSession().setAttribute("movieUrl", obj);
		request.getSession().setAttribute("movieType", obj1);
		response.sendRedirect("pages/cinema.jsp");
		return;
		
		
	}

}
