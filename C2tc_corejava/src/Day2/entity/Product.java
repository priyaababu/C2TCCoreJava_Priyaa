package Day2.entity;

public class Product {

	private int productid;
	private int cost;
	private int quantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	 

}
