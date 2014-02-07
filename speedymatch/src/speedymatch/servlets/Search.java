package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import speedymatch.entities.*;
import speedymatch.entities.dao.AdminSearchDAO;
import speedymatch.entities.dao.MemberDAO;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Search() {
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
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "speedymatch";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "adming1vWayv";
        String password = "2MVCBKUIFISG";
        
        Statement st;
        ResultSet rs = null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected!");
            
				String gender = request.getParameter("gen");
				String smoking = request.getParameter("smoke");
				String drinking = request.getParameter("drink");
				String relaStatus = request.getParameter("Status");
				String child = request.getParameter("child");
				String education = request.getParameter("edu");
				String zodic = request.getParameter("zodiac");
				String occ = request.getParameter("occ");


	            ArrayList al = null;
	            ArrayList pid_list = new ArrayList();
	            //String query= "select m.username, m.fname, m.lname, p.age, p.gender, p.eduLevel, p.hobby, p.height, p.weight, p.race, p.religion, p.child, p.horo, p.occupation, p.smoking, p.drinking, p.relaStatus from Member m inner join Profile p on m.username = p.username where m.username ='" + username +"'";
	            String [] query={"select m.username from Member m inner join Profile p on m.username=p.username where p.gender='m'", "select m.username from Member m inner join Profile p on m.username=p.username where p.smoking='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.drinking='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.relaStatus='single'", "select m.username from Member m inner join Profile p on m.username=p.username where p.child='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.eduLevel='master'", "select m.username from Member m inner join Profile p on m.username=p.username where p.horo='pisces'", "select m.username from Member m inner join Profile p on m.username=p.username where p.occupation='business owner'", "select m.username from Member m inner join Profile p on m.username=p.username where p.race='Malay'", "select m.username from Member m inner join Profile p on m.username=p.username where p.religion='Buddhist'", "select m.username from Member m inner join Profile p on m.username=p.username where p.hobby='gardening'"};
	            /*String query1="select m.username from Member m inner join Profile p on m.username=p.username where p.gender='male'";
				String query2="select m.username from Member m inner join Profile p on m.username=p.username where p.smoking='no'";
				String query3="select m.username from Member m inner join Profile p on m.username=p.username where p.drinking='no'";
				String query4="select m.username from Member m inner join Profile p on m.username=p.username where p.relaStatus='single'";
				String query5="select m.username from Member m inner join Profile p on m.username=p.username where p.child='no'";
				String query6="select m.username from Member m inner join Profile p on m.username=p.username where p.education='master'";
				String query7="select m.username from Member m inner join Profile p on m.username=p.username where p.horo='pisces'";
				String query8="select m.username from Member m inner join Profile p on m.username=p.username where p.occupation='business owner'";
				String query9="select m.username from Member m inner join Profile p on m.username=p.username where p.race='Malay'";
				String query10="select m.username from Member m inner join Profile p on m.username=p.username where p.religion='Buddhist'";
				String query11="select m.username from Member m inner join Profile p on m.username=p.username where p.hobby='gardening'";
				String query = query1 + query2 + query3 + query4 + query5 +query6 + query7 + query8 + query9 + query10 + query11;*/
	            
				System.out.println("query " + query);
	            st = conn.createStatement();
	            //ResultSet rs = st.executeQuery(query);
	            
	            for (int i=0; i<query.length; i++){
					PreparedStatement pstmt = conn.prepareStatement(query[i]);
				
					rs=pstmt.executeQuery(query[i]);
					
	            }
	            while (rs.next()) {
	                al = new ArrayList();
	 
	                al.add(rs.getString(1));
	                /*al.add(rs.getString(2));
	                al.add(rs.getString(3));
	                al.add(rs.getString(4));
	                al.add(rs.getString(5));
	                al.add(rs.getString(6));
	                al.add(rs.getString(7));
	                al.add(rs.getString(8));
	                al.add(rs.getString(9));
	                al.add(rs.getString(10));
	                al.add(rs.getString(11));*/
	 
	                System.out.println("al :: " + al);
	                pid_list.add(al);
	                
	            }
				request.getSession().setAttribute("piList", pid_list);
				response.sendRedirect("pages/searchResult.jsp");
				conn.close();
	            System.out.println("Disconnected!");
	            }catch (Exception e) {
            e.printStackTrace();
        }
	}
}
