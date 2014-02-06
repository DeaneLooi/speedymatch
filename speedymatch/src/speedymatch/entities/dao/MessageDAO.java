package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import speedymatch.entities.Messages;
import speedymatch.utils.Algorithms;

public class MessageDAO {

	private static DBController db = new DBController();

	public static Messages createMessage(Messages n) {
		Connection currentCon = db.getConnection();
		java.sql.Date date = new java.sql.Date(n.getDate().getTime());

		try {
			String query = "insert into Message(sender,receiver,message,date)"
					+ "values(?,?,?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.setString(1, n.getSender());
			pstmt.setString(2, n.getReceiver());
			pstmt.setString(3, n.getMessage());
			pstmt.setDate(4, date);

			pstmt.executeUpdate();

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

		System.out.println(n.getMessage());
		return n;
	}

	public static ArrayList<Messages> searchMessages(String receiver, String username) {
		Connection currentCon = db.getConnection();
		ArrayList<Messages> messages = new ArrayList<Messages>();
		ResultSet rs = null;

		try {
			String query = "select * from Message where receiver =? AND sender=?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(2, receiver);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String sender = rs.getString(1);
				String recipient = rs.getString(2);
				String encryptedMessage = rs.getString(3);
				Date date = rs.getDate(4);
				
				String decryptedMessage = Algorithms.decrypt(encryptedMessage, "testingsecretkey");
				
				Messages n = new Messages(sender, recipient, decryptedMessage, date);
				messages.add(n);
			}
		} catch (Exception ex) {
			messages = null;
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
		return messages;
	}

	public static void main(String args[]) {
		
	}
}
