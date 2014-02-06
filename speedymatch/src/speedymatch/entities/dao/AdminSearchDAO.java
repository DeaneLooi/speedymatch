package speedymatch.entities.dao;

import java.util.*;
import java.sql.*;

import speedymatch.entities.Profile;

public class AdminSearchDAO{
	
	static Connection currentcon = null;
	static ResultSet rs = null;
	static PreparedStatement pt = null;
	
	//can retrieve
	public boolean adminSearch(){
		boolean success = false;
		ResultSet r =null;
		DBManager db = new DBManager();
		Connection con=DBManager.getConnection();
		
		
		String dbQuery = "select * from Member m inner join Profile p on m.username = p.username where p.hobby = 'collecting'";
		//String dbQuery = "select m.username, p.age, p.gender, p.eduLevel, p.hobby, p.height, p.weight, p.race, p.religion, p.child, p.horo, p.occupation, p.smoking, p.drinking, p.relaStatus from Member m inner join Profile p on m.username = p.username where p.hobby='gardening'";
				//='" + hobby +"'";
		r=db.readRequest(dbQuery);
		
		try{
			if (r.next() ){
				String username=r.getString("username");
				int age=r.getInt("age");
				String gender=r.getString("gender");
				String eduLevel = r.getString("eduLevel");
				String hobby = r.getString("hobby");
				int weight = r.getInt("weight");
				int height = r.getInt("height");
				String race = r.getString("race");
				String religion = r.getString("religion");
				String child = r.getString("child");
				String horo = r.getString("horo");
				String occupation = r.getString("occupation");
				String smoking = r.getString("smoking");
				String drinking = r.getString("drinking");
				String relaStatus = r.getString("relaStatus");
				
				System.out.println(username+" "+age+" "+gender+" "+ eduLevel +" "+hobby+" "+weight+" "+height+" "+race+" "+religion+" "+child+" "+horo+" "+occupation+" "+smoking+" "+drinking+" "+relaStatus+" ");
				
				System.out.println(username);
				success=true;
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
	db.terminate();
	return success;
	}
	
	
	//mian method
	public static void main(String[] args){
		AdminSearchDAO a = new AdminSearchDAO();
		//a.retrieveList();
		a.adminSearch();
//		ArrayList <Profile> searchList = new ArrayList<Profile>();
//		for(int i=0; i< searchList.size(); i++){
//			
//			p = searchList.get(i);
//			System.out.println("item" + i + ":" + p);
//		}	
		
	}
	
}