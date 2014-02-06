package speedymatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Horoscope;
import speedymatch.entities.dao.HoroscopeDAO;

/**
 * Servlet implementation class HoroscopeServlet
 */
@WebServlet("/HoroscopeServlet")
public class HoroscopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HoroscopeServlet() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sign1 = Integer.parseInt(request.getParameter("sign1"));
		int sign2 = Integer.parseInt(request.getParameter("sign2"));

		Horoscope h1 = new Horoscope();
		h1.setHoroscopeID(sign1);
		Horoscope h2 = new Horoscope();
		h2.setHoroscopeID(sign2);

		h1 = HoroscopeDAO.retrieveHoroscope(h1);
		h2 = HoroscopeDAO.retrieveHoroscope(h2);

		Object s1 = new Object();
		s1 = "<p>" + h1.getHoroscopeDesc() + "</p>";
		request.getSession().setAttribute("sign1", s1);

		Object s2 = new Object();
		s2 = "<p>" + h2.getHoroscopeDesc() + "</p>";
		request.getSession().setAttribute("sign2", s2);

		Object t1 = new Object();
		t1 = "<strong>" + h1.getHoroscope() + "</strong>";
		request.getSession().setAttribute("trait1", t1);

		Object t2 = new Object();
		t2 = "<strong>" + h2.getHoroscope() + "</strong>";
		request.getSession().setAttribute("trait2", t2);

		response.sendRedirect("pages/loveMeter.jsp");

	}

}
