package collections;

import java.util.ArrayList;

public class ShoppingCart {

	private String productName;
	private int productId;
	private int price;

	public ShoppingCart(String productName, int productId, int price) {
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {

		ShoppingCart p1 = new ShoppingCart("Oil", 123, 50);
		ShoppingCart p2 = new ShoppingCart("Veggies", 124, 60);
		ShoppingCart p3 = new ShoppingCart("Eggs", 125, 20);

		int sum = 0;
		ArrayList<ShoppingCart> al = new ArrayList<ShoppingCart>();
		al.add(p1);
		al.add(p2);
		al.add(p3);

		for (ShoppingCart i : al) {
			sum = sum + i.getPrice();
		}

		System.out.println("Total cart value: " + sum);
	}

}
