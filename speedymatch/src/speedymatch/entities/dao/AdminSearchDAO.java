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
			
			String [] query={"select m.username from Member m inner join Profile p "
					+ " m.username=p.username where p.gender='m'", "select m.username from Member m inner join Profile p on m.username=p.username where p.smoking='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.drinking='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.relaStatus='single'", "select m.username from Member m inner join Profile p on m.username=p.username where p.child='no'", "select m.username from Member m inner join Profile p on m.username=p.username where p.eduLevel='master'", "select m.username from Member m inner join Profile p on m.username=p.username where p.horo='pisces'", "select m.username from Member m inner join Profile p on m.username=p.username where p.occupation='business owner'", "select m.username from Member m inner join Profile p on m.username=p.username where p.race='Malay'", "select m.username from Member m inner join Profile p on m.username=p.username where p.religion='Buddhist'", "select m.username from Member m inner join Profile p on m.username=p.username where p.hobby='gardening'"};
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
			//String query = "select username, gender,smoking, drinking, relaStatus, child, eduLevel, horo, occupation, race, religion, hobby from Profile where username='deane'";
			//String query = "select m.username, p.gender, p.smoking, p.drinking, p.relaStatus, p.child, p.eduLevel, p.horo, p.occupation, p.race, p.religion, p.hobby from Member m inner join Profile";
			//PreparedStatement pstmt = currentCon.prepareStatement(query);
			//rs = pstmt.executeQuery();
			
			for (int i=0; i<11; i++){
				PreparedStatement pstmt = currentCon.prepareStatement(query[i]);
			
			rs=pstmt.executeQuery(query[i]);
			pstmt.close();
			}
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
		Member m =new Member("tanwaikit", "tanwaikit");
		AdminSearchDAO.advanceSearch(m);
		
	}
}