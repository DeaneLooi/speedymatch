package speedymatch.entities.dao;

import java.util.*;
import java.sql.*;

import speedymatch.entities.Member;
import speedymatch.entities.Profile;

public class AdminSearchDAO{
	/*public boolean adminSearch(){
		DBManager db = new DBManager();
		Connection currentCon = db.getConnection();
		ResultSet r =null;
		Member m = null;
		
		try{
            String query="select * from Profiles"; 
            
            while(r.next()){
                    r.getString("username");
                    r.getString("gender");
                    r.getString("age");
            }

    }catch(Exception ex){
            ex.printStackTrace();
            m = null;
    }finally {

            if (currentCon != null) {
                    try {
                            currentCon.close();
                    } catch (Exception e) {
                    }

                    currentCon = null;
            }
    }
		return false;

  }*/
		
	public boolean adminSearch(){
		boolean success = false;
		ResultSet r =null;
		DBManager db = new DBManager();
		Connection con=db.getConnection();
		
		String dbQuery = "select * from Profiles";
		r=db.readRequest(dbQuery);
		
		try{
			if (r.next() ){
				int username=r.getInt("username");
				String age=r.getString("age");
				String gender=r.getString("gender");
				System.out.println(username+" "+age+" "+gender+" ");
				success=true;
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
	db.terminate();
	return success;
	}
	
	public static void main(String[] args){
		AdminSearchDAO a = new AdminSearchDAO();
		a.adminSearch();
	}
	
	
	
	/*public static void main(String[] args) throws Exception{
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con = DriverManager.getConnection
	      ("jdbc:mysql://127.0.0.1:3306/speedymatch","adming1vWayv",
	      "2MVCBKUIFISG");
	      Statement stmt = con.createStatement();
	      String query[] ={"SELECT * FROM Profiles"};
	      for(String q : query){
	         ResultSet rs = stmt.executeQuery(q);
	         while (rs.next()) {
	            int username = rs.getInt("username");
	            String age = rs.getString("age");
	            String gender = rs.getString("gender");
	            System.out.print(username+"  "+age+" "+gender+" ");
	            
	         }
	         System.out.println();
	      }
	   }*/
}