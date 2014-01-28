package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import speedymatch.entities.Product;

public class ProductDAO {
	private static DBController db = new DBController();

	public static Product retrieveProduct(Product product) {
		Connection currentCon = db.getConnection();
		Product p = null;
		ResultSet rs = null;

		try {
			String query = "select * from Product";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setInt(1, product.getProductID());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				p = new Product(rs.getString("productName"),
						rs.getString("productDesc"), rs.getInt("productCost"));
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

}
