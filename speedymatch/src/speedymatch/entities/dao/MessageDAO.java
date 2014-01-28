package speedymatch.entities.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import speedymatch.entities.Messages;

public class MessageDAO {

	private static DBController db = new DBController();

	public static Messages createMessage(Messages n) {
		Connection currentCon = db.getConnection();

		try {
			String query = "insert into message(sender,receiver,message,date)"
					+ "values(?,?,?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.setString(1, n.getSender());
			pstmt.setString(2, n.getReceiver());
			pstmt.setString(3, n.getMessage());
			pstmt.setLong(4, n.getDate());

		} catch (Exception ex) {
			System.out.println("message not sent: An error has occured!" + ex);
			n = null;
		} finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {

				}

				currentCon = null;
			}
		}
		return n;
	}

	public static ArrayList<Messages> searchMessages(String receiver) {
		Connection currentCon = db.getConnection();
		ArrayList<Messages> messages = new ArrayList<Messages>();
		ResultSet rs = null;

		try {
			String query = "select * from message where receiver =?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(2, receiver);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String sender = rs.getString(1);
				String recipient = (rs.getString(2));
				String message = rs.getString(3);
				long date = rs.getLong(4);

				Messages n = new Messages(sender, recipient, message, date);
				messages.add(n);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			messages = null;
		} finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return messages;
	}

	public static Messages deleteMessage(Messages n) {
		Connection currentCon = db.getConnection();

		try {
			String query = "delete from message where sender = ? and receiver = ? and message = ?";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, n.getSender());
			pstmt.setString(2, n.getReceiver());
			pstmt.setString(3, n.getMessage());
			pstmt.setLong(4, n.getDate());

			pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Delete failed: An error has occured! " + ex);
			n = null;
		} finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return n;
	}

	public static void deleteMessages() {
		Connection currentCon = db.getConnection();

		try {
			String query = "delete from message";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Delete failed: An error has occured! " + ex);
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

	public static void main(String args[]) {

	}
}