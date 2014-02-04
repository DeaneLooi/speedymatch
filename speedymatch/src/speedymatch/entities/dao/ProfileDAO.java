package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import speedymatch.entities.Profile;
import speedymatch.entities.Member;

public class ProfileDAO {

	private static DBController db = new DBController();

	public static Profile retrieveProfile(Profile profile) {
		Connection currentCon = db.getConnection();
		Profile p = null;
		ResultSet rs = null;

		try {
			String query = "select * from Profile INNER JOIN Member ON Member.username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, profile.getUsername());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				p = new Profile((String) profile.getUsername(),
						rs.getInt("age"), rs.getString("gender"),
						rs.getString("eduLevel"), rs.getString("hobby"),
						rs.getInt("height"), rs.getInt("weight"),
						rs.getString("race"), rs.getString("religion"),
						rs.getString("child"), rs.getString("horo"),
						rs.getString("occupation"), rs.getString("smoking"),
						rs.getString("drinking"), rs.getString("relaStatus"));

			}

		} catch (Exception ex) {
			ex.printStackTrace();
			p = null;
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return p;
	}

	public static Profile createProfile(Profile profile) {
		Connection currentCon = db.getConnection();

		try {
			String query = "insert into Profile(username, age, gender, eduLevel, hobby, height, weight, race, religion, child, horo, occupation, smoking, drinking, relaStatus) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, profile.getUsername());
			pstmt.setInt(2, profile.getAge());
			pstmt.setString(3, profile.getGender());
			pstmt.setString(4, profile.getEduLevel());
			pstmt.setString(5, profile.getHobby());
			pstmt.setInt(6, profile.getHeight());
			pstmt.setInt(7, profile.getWeight());
			pstmt.setString(8, profile.getRace());
			pstmt.setString(9, profile.getReligion());
			pstmt.setString(10, profile.getChild());
			pstmt.setString(11, profile.getHoro());
			pstmt.setString(12, profile.getOccupation());
			pstmt.setString(13, profile.getSmoking());
			pstmt.setString(14, profile.getDrinking());
			pstmt.setString(15, profile.getRelaStatus());

			pstmt.executeUpdate();

		} catch (Exception ex) {

			System.out
					.println("Create Profile failed: An Exception has occurred! "
							+ ex);
			profile = null;

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

	public static Profile updateProfile(Profile profile) {
		Connection currentCon = db.getConnection();

		try {
			String query = "UPDATE Profile SET age = ?, gender = ?, eduLevel = ?, hobby = ?, height = ?, weight = ?, race = ?, religion = ?, child = ?, horo = ?, occupation = ?, smoking = ?, drinking = ?, relaStatus = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setInt(1, profile.getAge());
			pstmt.setString(2, profile.getGender());
			pstmt.setString(3, profile.getEduLevel());
			pstmt.setString(4, profile.getHobby());
			pstmt.setInt(5, profile.getHeight());
			pstmt.setInt(6, profile.getWeight());
			pstmt.setString(7, profile.getRace());
			pstmt.setString(8, profile.getReligion());
			pstmt.setString(9, profile.getChild());
			pstmt.setString(10, profile.getHoro());
			pstmt.setString(11, profile.getOccupation());
			pstmt.setString(12, profile.getSmoking());
			pstmt.setString(13, profile.getDrinking());
			pstmt.setString(14, profile.getRelaStatus());
			pstmt.setString(15, profile.getUsername());

			pstmt.executeUpdate();

		} catch (Exception ex) {

			System.out
					.println("Update Profile failed: An Exception has occurred! "
							+ ex);
			profile = null;

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

	/*
	 * public static void main(String args[]) {
	 * 
	 * }
	 */
}
