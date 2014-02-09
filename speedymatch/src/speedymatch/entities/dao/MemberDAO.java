package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import speedymatch.entities.FriendList;
import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.Profile;
import speedymatch.utils.Algorithms;

public class MemberDAO {

	private static DBController db = new DBController();

	public static Member registerAccount(Member member,
			MemberSecurity memberSecurity,Profile profile) {
		Connection currentCon = db.getConnection();
		java.sql.Date dob = new java.sql.Date(member.getDob().getTime());
		java.sql.Date regDate = new java.sql.Date(memberSecurity.getRegDate()
				.getTime());
		try {
			String query = "insert into Member(username, passwd, email, Fname, Lname, dob, profilePic) values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			// inserting values
			pstmt.setString(1, member.getUsername());
			pstmt.setString(
					2,
					Algorithms.getHash(member.getPasswd(),
							memberSecurity.getSalt()));
			pstmt.setString(
					3,
					Algorithms.encrypt(member.getEmail(),
							memberSecurity.getSalt()));
			pstmt.setString(4, member.getFname());
			pstmt.setString(5, member.getLname());
			pstmt.setDate(6, dob);
			pstmt.setString(7, member.getProfilePic());

			query = "insert into MemberSecurity(username, salt, token, membership, regDate, disabled, communication) values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt1 = currentCon.prepareStatement(query);
			pstmt1 = currentCon.prepareStatement(query);
			pstmt1.setString(1, member.getUsername());
			pstmt1.setString(2, memberSecurity.getSalt());
			pstmt1.setString(3, memberSecurity.getToken());
			pstmt1.setString(4, Algorithms.encrypt(
					memberSecurity.getMembership(), memberSecurity.getSalt()));
			pstmt1.setDate(5, regDate);
			pstmt1.setString(6, String.valueOf(memberSecurity.getDisabled()));
			pstmt1.setString(7, memberSecurity.getCommunication());

			pstmt.executeUpdate();
			pstmt1.executeUpdate();

			FriendList fl = new FriendList(member.getUsername(), null);
			FriendListDAO.createFriendList(fl);

			ProfileDAO.createProfile(profile);

		} catch (Exception ex) {

			System.out
					.println("Registration failed: An Exception has occurred! "
							+ ex);
			member = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return member;
	}

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
						rs.getString("Lname"), rs.getDate("dob"),rs.getString("profilePic"));
				ms = new MemberSecurity(rs.getString("salt"),
						rs.getString("token"), rs.getString("membership"),
						rs.getDate("regDate"), rs.getString("disabled").charAt(
								0));
				m.setEmail(Algorithms.decrypt(m.getEmail(), ms.getSalt()));
				ms.setMembership(Algorithms.decrypt(ms.getMembership(),
						ms.getSalt()));
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
		if (!member.getPasswd().isEmpty()) {

			try {
				String selectQuery = "select passwd from Member where username= ?";
				PreparedStatement pstmt1 = currentCon
						.prepareStatement(selectQuery);
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
		}

		return password;
	}

	public static boolean checkUsername(String username) {
		boolean check = false;
		Connection currentCon = db.getConnection();
		ResultSet rs = null;
		Member m = new Member(username, null);
		try {
			String query = "select username from Member where username = ?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				m.setUsername(rs.getString(1));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				currentCon = null;
			}
		}

		if (m.getUsername() != null) {
			check = true;
		}

		else {
			check = false;
		}

		return check;

	}

	public static boolean checkEmail(String email) {
		boolean check = false;
		Connection currentCon = db.getConnection();
		ResultSet rs = null;
		String e = null;
		try {
			String query = "select email from Member where email = ?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				e = rs.getString("email");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				currentCon = null;
			}
		}
		if (e == null) {
			check = true;
		}

		else {
			check = false;
		}

		return check;

	}

	/* Update member */
	public static Member updateMember(Member member) {
		Connection currentCon = db.getConnection();

		try {
			String query = "UPDATE Member SET fname = ?, lname = ?, email = ? WHERE username = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, member.getFname());
			pstmt.setString(2, member.getLname());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getUsername());

			pstmt.executeUpdate();

		} catch (Exception ex) {

			System.out
					.println("Update Member failed: An Exception has occurred! "
							+ ex);
			member = null;

		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return member;
	}

	/*
	 * public static void main(String args[]){
	 * 
	 * @SuppressWarnings("deprecation") Date dob = new Date(1995, 9, 27); Member
	 * m = new
	 * Member("GreenTeaxD","password","deanelooiz@hotmail.com","Deane","Looi"
	 * ,dob); MemberSecurity ms = new
	 * MemberSecurity("salt","token","Admin",dob,'F',"Phone");
	 * 
	 * Member member = MemberDAO.registerAccount(m, ms); if(member!=null){
	 * Member yw = new Member("GreenTeaxD","password"); Member mem =
	 * MemberDAO.retrieveAccount(yw); MemberSecurity memS =
	 * mem.getMemberSecurity();
	 * System.out.println(mem.getUsername()+mem.getPasswd
	 * ()+memS.getMembership()+memS.getSalt()); }
	 * 
	 * }
	 */

}
