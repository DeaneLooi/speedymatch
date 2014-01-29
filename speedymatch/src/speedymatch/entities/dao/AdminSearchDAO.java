package speedymatch.entities.dao;

import java.util.*;
import java.sql.*;

import speedymatch.entities.Member;
import speedymatch.entities.Profile;

public class AdminSearchDAO{
		
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
	
}