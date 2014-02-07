package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import speedymatch.entities.Notification;

public class NotificationDAO {

	
	private static DBController db = new DBController();

	public static Notification createNotification(Notification n) {
		Connection currentCon = db.getConnection();


		try {
			String query = "insert into Notification(sender,receiver,notification)"
					+ "values(?,?,?)";
			PreparedStatement pstmt = currentCon.prepareStatement(query);

			pstmt.setString(1, n.getSender());
			pstmt.setString(2, n.getReceiver());
			pstmt.setString(3, n.getNotification());

			pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out.println("notification not created: An error has occured!" + ex);
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

	public static ArrayList<Notification> retrieveNotifications(Notification n) {
		Connection currentCon = db.getConnection();
		ArrayList<Notification> notificationList = new ArrayList<Notification>();
		ResultSet rs = null;

		try {
			String query = "select * from Notification where receiver =?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, n.getReceiver());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String sender = rs.getString(1);
				String receiver = (rs.getString(2));
				String notification = rs.getString(3);

				Notification n1 = new Notification(sender, receiver, notification);
				notificationList.add(n1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			notificationList = null;
		} finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return notificationList;
	}
	
	public static boolean deleteNotification(Notification n){
		
		Connection currentCon = db.getConnection();
		boolean check = false;

		try {
			String query = "delete from notification where sender=?, receiver=?, notification=?;";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, n.getSender());
			pstmt.setString(2, n.getReceiver());
			pstmt.setString(3, n.getNotification());
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
			return check;
		} finally {
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
			

		}
		
		check = true;
		return check;
		
	}
	
	public static void main(String args[]){
		Notification n = new Notification("deane","tanwaikit","Cinema");
		ArrayList<Notification> n1 = NotificationDAO.retrieveNotifications(n);
		System.out.println(n1.get(0).getNotification());
	}
}
