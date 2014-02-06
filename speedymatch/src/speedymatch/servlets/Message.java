package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

		Member m = (Member) request.getSession().getAttribute("member");
		String sender = m.getUsername();
		String receiver = (String) request.getParameter("receiver");

		MessageDAO.searchMessages(receiver, sender);
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
		String receiver = (String) request.getAttribute("receiver2");
		String message = (String) request.getParameter("msg");
		Date date = new Date();

		String encryptedmessage = "";

		try {

			encryptedmessage = Algorithms.encrypt(message, "testingsecretkey");
			System.out.println(encryptedmessage);
			System.out.println(sender);
			System.out.println(receiver);
			System.out.println(date);
			Messages pmsg = new Messages(sender, receiver, encryptedmessage,
					date);
			MessageDAO.createMessage(pmsg);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
