package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String productName;
	int price;
	
	
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public static List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Air");
		productList.add("Apple MacBook Pro");
		productList.add("Apple iPhone 14");
		return productList;
	}
	
	
	
	
}
