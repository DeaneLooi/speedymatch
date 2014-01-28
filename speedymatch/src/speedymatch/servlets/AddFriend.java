package speedymatch.servlets;

import java.io.IOException;

import speedymatch.entities.FriendList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddFriend extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public AddFriend() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/stream");
		response.setHeader("Cache-Control", "no-cache");
		
		ServletOutputStream outStream = response.getOutputStream();
		outStream.write(new byte[0],0,0);
		outStream.flush();
		outStream.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/xml");
	response.setHeader("Cache-Control", "no-cache");
	
	String username = request.getParameter("username");
	
	}
	
}

