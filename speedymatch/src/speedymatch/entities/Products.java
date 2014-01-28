package speedymatch.entities;

public class Products {

	private int cost;
	private String prodDesc;

	public Products(int cost, String prodDesc) {
		super();
		this.cost = cost;
		this.prodDesc = prodDesc;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
}
