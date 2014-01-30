package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import speedymatch.entities.Product;

public class ProductDAO {
	private static DBController db = new DBController();

	public static Product retrieveProducts(Product p) {

		Connection currentCon = db.getConnection();
		ArrayList<String> products = new ArrayList<String>();
		String productstring = null;
		ResultSet rs = null;
		try {
			String query = "select * from Product";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			pstmt.setInt(1, p.getProductID());
			pstmt.setInt(2, p.getProductCost());
			pstmt.setString(3, p.getProductDesc());
			pstmt.setString(4, p.getProductName());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				productstring = String.valueOf(rs.getInt(1));
				productstring = String.valueOf(rs.getInt(2));
				productstring = rs.getString(3);
				productstring = rs.getString(4);
			}

			Scanner sc = new Scanner(productstring);
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				String product = sc.next();
				products.add(product);
			}
			p.setProductList(products);
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

	public static void main(String[] args) {

		Product p = new Product();
		retrieveProducts(p);
		System.out.println(p.getProductCost() + p.getProductDesc()
				+ p.getProductID() + p.getProductName());
	}
}
