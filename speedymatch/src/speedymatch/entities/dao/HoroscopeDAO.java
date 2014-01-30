package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import speedymatch.entities.Horoscope;

public class HoroscopeDAO {

	private static DBController db = new DBController();

	public static Horoscope retrieveHoroscope(Horoscope horoscope) {
		Connection currentCon = db.getConnection();
		Horoscope h = null;
		ResultSet rs = null;

		try {
			String query = "select horoscopeDesc from Horoscope where horoscope = '"
					+ horoscope.getHoroscope() + "'";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setString(1, h.getHoroscopeDesc());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				h = new Horoscope(rs.getString("horoscopeDesc"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			h = null;
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return h;
	}

	public static void main(String[] args) {

		Horoscope horo = new Horoscope("Aries");
		retrieveHoroscope(horo);
		System.out.println(horo.getHoroscopeDesc());
	}
}