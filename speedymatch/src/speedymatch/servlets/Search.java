package speedymatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "speedymatch";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "adming1vWayv";
        String password = "2MVCBKUIFISG";
        
        Statement st;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected!");
            
            String gender = request.getParameter("gen");
            String smoking = request.getParameter("smoke"); 
            /*String drinking = request.getParameter("drink");
            String relaStatus = request.getParameter("Status");
            String child =request.getParameter("child");
            String education = request.getParameter("edu");
            String Zodic =request.getParameter("zodiac");
            String Occupation = request.getParameter("occ");*/
            out.println(gender+ ""+ smoking+"");
            
 
            ArrayList al = null;
            ArrayList pid_list = new ArrayList();
            //String query= "select * from Member";
            String query= "select * from Member m inner join Profile p on m.username = p.username where gender ='male'";
            	//	+ "'" + gender + "'";
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            int count =0;
            
            while (rs.next()) {
            	count++;
            	
                al = new ArrayList();

                al.add(rs.getString(1));
                al.add(rs.getString(2));
                /*al.add(rs.getString(3));
                al.add(rs.getString(4));
                al.add(rs.getString(5));
                al.add(rs.getString(6));
                al.add(rs.getString(7));
                al.add(rs.getString(8));
                al.add(rs.getString(9));
                al.add(rs.getString(10));
                al.add(rs.getString(11));
                al.add(rs.getString(12));
                al.add(rs.getString(13));
                al.add(rs.getString(14));
                al.add(rs.getString(15));
                al.add(rs.getString(16));
                al.add(rs.getString(17));*/
 
                out.println("al :: " + al);
                pid_list.add(al);
             out.println(count);
 }          
            request.setAttribute("piList", pid_list);
            RequestDispatcher view = request.getRequestDispatcher("testing.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
