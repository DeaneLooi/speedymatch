/*Tan Wai Kit
IS1201
123696F*/

package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import speedymatch.entities.FriendList;

public class FriendListDAO {

	private static DBController db = new DBController();
	
	public static FriendList createFriendList(FriendList f) {
		Connection currentCon = db.getConnection();
		try {
			String query = "insert into FriendList(userId, friendId) "
					+ "values(?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.setString(1, f.getUserId());
			pstmt.setString(2, ",");
			pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out.println("Create friend list failed: An error has occured! " + ex);
		}

		finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return f;
	}

	public static FriendList addFriends(FriendList f,String username) {
		Connection currentCon = db.getConnection();
		
		FriendList fl = FriendListDAO.retrieveFriends(f);
		ArrayList<String>friends = fl.getFriendList();
		if(friends.size()==0){
			friends = new ArrayList<String>();
		}
		friends.add(username);
		String friendstring = "";
		
		for(int i = 0; i<friends.size();i++){
			friendstring += friends.get(i)+",";
		}
		try {
			String query = "update FriendList set friendId = ? where userId = ? ";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.setString(1, friendstring);
			pstmt.setString(2, f.getUserId());
			pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out
					.println("Add friend failed: An error has occured! " + ex);
		}

		finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return f;
	}
	
	public static FriendList retrieveFriends(FriendList f){
		
		Connection currentCon = db.getConnection();
		ArrayList<String>friends = new ArrayList<String>();
		String friendstring = null;
		ResultSet rs = null;
		try{
			String query = "select friendId from FriendList where userId = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, f.getUserId());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				friendstring = rs.getString(1);
			}
			
			Scanner sc = new Scanner(friendstring);
			sc.useDelimiter(",");
			while(sc.hasNext()){
				String friend = sc.next();
				friends.add(friend);
			}
			f.setFriendList(friends);
		}
		catch(Exception ex){
			ex.printStackTrace();
			f = null;
		}
		finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		
		return f;
	}

	public static FriendList deleteFriends(FriendList d, String friendId) {
		Connection currentCon = db.getConnection();
		String friendstring ="";
		int index = 0;
		try {
			
			FriendList friends = FriendListDAO.retrieveFriends(d);
			ArrayList<String> f = friends.getFriendList();
			
			for(int i=0; i<f.size(); i++){
				String fId = f.get(i);
				
				System.out.println(fId);
				if(fId.equals(friendId)){
					f.remove(i);
				}
			}
			
			for(int i = 0; i<f.size();i++){
				friendstring += f.get(i)+",";
			}
			
			System.out.println(friendstring);
			d.setFriendList(f);
			String query = "update FriendList set friendId = ? where userId = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, friendstring);
			pstmt.setString(2, d.getUserId());
			
			pstmt.executeUpdate();
			
		} catch (Exception ex) {
			System.out.println("Delete failed: An error has occured! " + ex);
			d = null;
		}
		return d;
	}
}
