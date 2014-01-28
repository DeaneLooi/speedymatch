package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import speedymatch.entities.Profile;
import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;

public class ProfileDAO {

	private static DBController db = new DBController();

	private static Member m;

	public static Member retrieveAccount(Member member) {
		Connection currentCon = db.getConnection();
		Member m = null;
		MemberSecurity ms = null;
		ResultSet rs = null;

		try {
			String query = "select * from Member INNER JOIN MemberSecurity ON Member.username = MemberSecurity.username where Member.username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, member.getUsername());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				m = new Member(member.getUsername(), rs.getString("passwd"),
						rs.getString("email"), rs.getString("Fname"),
						rs.getString("Lname"), rs.getDate("dob"));
				ms = new MemberSecurity(rs.getString("salt"),
						rs.getString("token"), rs.getString("membership"),
						rs.getDate("regDate"), rs.getString("disabled").charAt(
								0), rs.getString("communication"));
			}

			m.addMemberSecurity(ms);

		} catch (Exception ex) {
			ex.printStackTrace();
			m = null;
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return m;
	}

	public static String changePassword(Member member) {
		Connection currentCon = db.getConnection();
		ResultSet rs = null;
		String password = "";
		try {
			String selectQuery = "select passwd from Member where username= ?";
			PreparedStatement pstmt1 = currentCon.prepareStatement(selectQuery);
			pstmt1.setString(1, member.getUsername());
			rs = pstmt1.executeQuery();
			while (rs.next()) {
				password = rs.getString(1);
			}

			String query = "update Member set passwd = ? where username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getUsername());
			pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Update failed: An Exception has occurred! "
					+ ex);
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return password;
	}

	public static void updateProfile() {
		Connection currentCon = db.getConnection();
		Statement statement = null;

		try {
			m = retrieveAccount(m);
			String updateTableSQL = "UPDATE Profile WHERE username = "
					+ m.getUsername() + "SET ;";

			statement = currentCon.createStatement();

			System.out.println(updateTableSQL);

			// execute update SQL statement
			statement.execute(updateTableSQL);

			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			// if (statement != null) {
			// statement.close();
			// }
			//
			// if (currentCon != null) {
			// currentCon.close();
			// }

		}

	}
}
