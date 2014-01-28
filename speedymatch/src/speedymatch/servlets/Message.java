package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import speedymatch.entities.Member;
import speedymatch.entities.Messages;
import speedymatch.entities.dao.MessageDAO;
import speedymatch.utils.Algorithms;

/**
 * Servlet implementation class Message
 */
@WebServlet("/Message")
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Message() {
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
	
		
		ArrayList<Messages> messages = new ArrayList<Messages>();
		
//		MessageDAO.searchMessages(receiver)
//		} catch(Exception ex){
//			ex.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String message = (String)request.getParameter("msg");
		
//		String encryptedMessage ="";
//		
//		try {
//			
//			encryptedMessage = Algorithms.encrypt(message,"TestingSecretKey");
//			System.out.println(encryptedMessage);
//			
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
		Messages pmsg = new Messages("WaiKit","Samuel",message, new Date());
		
	}

}
