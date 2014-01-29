package speedymatch.entities;

import java.util.ArrayList;

public class Product {

	private int productID;
	private int productCost;
	private String productDesc;
	private String productName;
	private ArrayList<String> productList;

	public Product() {
	}

	public Product(String productName, String productDesc, int productCost) {
		super();
		this.productCost = productCost;
		this.productDesc = productDesc;
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int cost) {
		this.productCost = cost;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String prodDesc) {
		this.productDesc = prodDesc;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public ArrayList<String> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<String> productList) {
		this.productList = productList;
	}
}
