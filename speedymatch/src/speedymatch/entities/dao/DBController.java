package speedymatch.entities.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBController {
	
	private Connection con;
	//previous DB
	//private String dbSource="//127.0.0.1:3306/speedymatch";
	private String dbSource="127.4.11.2:3306";
	private String user="adming1vWayv";
	private String password="2MVCBKUIFISG";
	
	
	public DBController(){
		super();
		try {
			testDriver();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public static void testDriver() throws Exception {
		System.out.println("Initializing Server... "); 
	try { 
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println(" Driver Found."); 
	} 
	catch (ClassNotFoundException e) { 
		System.out.println(" Driver Not Found, exiting.."); 
		throw (e); 
		} 
	
	}
	
	public Connection getConnection(){ 

		String url = ""; 
		try { 
			url = "jdbc:mysql:"+dbSource; 
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Successfully connected to " + dbSource+ "."); 
		} 
		catch (java.sql.SQLException e) { 
			System.out.println("Connection failed ->"+ dbSource); 
			System.out.println(e); 
		} 
		return con;
		
//		Context initCtx = null;
//		try {
//			initCtx = new InitialContext();
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Context envCtx = null;
//		try {
//			envCtx = (Context) initCtx.lookup("java:comp/env");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DataSource ds = null;
//		try {
//			ds = (DataSource)
//			  envCtx.lookup("jdbc/SpeedyMatchDB");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			con = ds.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return con;
	} 
	
	public void terminate() {
		// close connection
		try {
			con.close();
			System.out.println("Connection is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
