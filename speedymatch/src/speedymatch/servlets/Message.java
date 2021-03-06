package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
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

/*Tan Wai Kit 
 * IS1201
 * 123696F */


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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
		
		System.out.println("something");

		Member m = (Member) request.getSession().getAttribute("member");
		String sender = "";
		if(m!=null){
			sender = m.getUsername();
		}
		String receiver = (String) request.getParameter("receiver");


		ArrayList<Messages> receivedmessages = MessageDAO.searchMessages(
				receiver, sender);
		ArrayList<Messages> sentmessages = MessageDAO.searchMessages(sender,
				receiver);
		PrintWriter writer = response.getWriter();
		String html = "";
		String content = "";

		for (int i = 0; i < receivedmessages.size(); i++) {
			sentmessages.add(receivedmessages.get(i));
		}

		Collections.sort(sentmessages);

		for (int i = 0; i < sentmessages.size(); i++) {
			content += "<p>" + sentmessages.get(i).getDate() + " "
					+ sentmessages.get(i).getSender() + ": "
					+ sentmessages.get(i).getMessage() + "</p>";
		}

		html += content;
		writer.println(html);
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Member m = (Member) request.getSession().getAttribute("member");
		String sender = m.getUsername();
		String receiver = (String) request.getParameter("receiver");
		String message = (String) request.getParameter("msg");
		Date date = new Date();
		System.out.println(sender);
		System.out.println(receiver);
		System.out.println(date);
		String encryptedmessage = "";

		try {

			encryptedmessage = Algorithms.encrypt(message, "testingsecretkey");
			System.out.println(encryptedmessage);
		
			Messages pmsg = new Messages(sender, receiver, encryptedmessage,
					date);
			MessageDAO.createMessage(pmsg);

		} catch (Exception ex) {
			System.out.println("post message error");
		}
	}
	
	//for testing out the DAOs
	
	public static void main(String args[]){
		String sender = "greentea";
		String receiver = "tanwaikit";
		String message = "Hello i hate you";
		Date date = new Date();
		String encryptedmessage = "";

		try {

			encryptedmessage = Algorithms.encrypt(message, "testingsecretkey");
			Messages n = new Messages(sender, receiver, encryptedmessage,
					date);
			MessageDAO.createMessage(n);

		} catch (Exception ex) {
			System.out.println("post message error");
			System.out.println(encryptedmessage);
			System.out.println(sender);
			System.out.println(receiver);
			System.out.println(date);
			
		}
	}
}
