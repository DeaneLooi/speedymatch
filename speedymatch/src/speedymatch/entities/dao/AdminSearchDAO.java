package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import speedymatch.entities.FriendList;
import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.Profile;
import speedymatch.utils.Algorithms;

public class AdminSearchDAO {

	private static DBController db = new DBController();

	public static Member advanceSearch(Member profile) {
		Connection currentCon = db.getConnection();
		Member m = null;
		ResultSet rs = null;

		try {
			ArrayList<String> al = null;
			ArrayList pid_list = new ArrayList();
			String query1="select m.username from Member m inner join Profile p on m.username=p.username where gender='female'";
			String query2="select m.username from Member m inner join Profile p on m.username=p.username where ='female'";
			String query3="";
			String query4="";
			String query = query1;
					//+ query2 + query3 + query4;
			//String query = "select username, gender,smoking, drinking, relaStatus, child, eduLevel, horo, occupation, race, religion, hobby from Profile where username='deane'";
			//String query = "select m.username, p.gender, p.smoking, p.drinking, p.relaStatus, p.child, p.eduLevel, p.horo, p.occupation, p.race, p.religion, p.hobby from Member m inner join Profile";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				al = new ArrayList();

				al.add(rs.getString(1));
				al.add(rs.getString(2));
				al.add(rs.getString(3));
				al.add(rs.getString(4));
				al.add(rs.getString(5));
				al.add(rs.getString(6));
				al.add(rs.getString(7));
				al.add(rs.getString(8));
				al.add(rs.getString(9));
				al.add(rs.getString(10));
				al.add(rs.getString(11));
				al.add(rs.getString(12));

				System.out.println("al :: " + al);
				pid_list.add(al);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return profile;
	}
	
	public static void main(String args[]) {
		//AdminSearchDAO a = new AdminSearchDAO();
		Member m =new Member(null, null);
		AdminSearchDAO.advanceSearch(m);
		
	}
}