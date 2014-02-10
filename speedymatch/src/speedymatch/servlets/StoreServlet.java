package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.Product;
import speedymatch.entities.dao.ProductDAO;

@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StoreServlet() {
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

		try {

			ArrayList<Product> product = ProductDAO.getProductList();
			request.setAttribute("product", product);
			request.getRequestDispatcher("pages/store.jsp").forward(request,
					response);

		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)

	throws ServletException, IOException {
		// TODO Auto-generated method stub

		/**
		 * response.setContentType("text/html"); PrintWriter out =
		 * response.getWriter(); Connection conn = null;
		 * 
		 * Statement st; try {
		 * Class.forName("com.mysql.jdbc.Driver").newInstance(); conn =
		 * DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" +
		 * "speedymatch", "adming1vWayv", "2MVCBKUIFISG");
		 * System.out.println("Connected!");
		 * 
		 * ArrayList al = null; ArrayList pid_list = new ArrayList(); String
		 * query = "select productName, productDesc, productCost from Product";
		 * System.out.println("query " + query); st = conn.createStatement();
		 * ResultSet rs = st.executeQuery(query);
		 * 
		 * while (rs.next()) { al = new ArrayList();
		 * 
		 * al.add(rs.getString(1)); al.add(rs.getString(2));
		 * al.add(rs.getString(3));
		 * 
		 * System.out.println("al :: " + al); pid_list.add(al);
		 * 
		 * }
		 * 
		 * request.getSession().setAttribute("piList", pid_list);
		 * 
		 * response.sendRedirect("pages/store.jsp");
		 * 
		 * conn.close(); System.out.println("Disconnected!"); } catch (Exception
		 * e) { e.printStackTrace(); }
		 **/

		try {

			ArrayList<Product> product = ProductDAO.getProductList();
			request.setAttribute("product", product);
			request.getRequestDispatcher("pages/store.jsp").forward(request,
					response);

		}

		catch (Throwable theException) {
			System.out.println(theException);
		}

	}

}
