package com.oops;

import java.util.ArrayList;

class Product{
	private String name;
	private int quantity;
	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

class Inventory{
	private ArrayList<Product> products;

	public Inventory() {
		products=new ArrayList<Product>();
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
	}
	public void checkLowInventory() {
		for(Product product:products) {
			if(product.getQuantity()<=10) {
				System.out.println(product.getName()+" is running low on inventory. Cureent quantity is "+product.getQuantity());
			}
			else {
				System.out.println(product.getName()+"is vailable with "+product.getQuantity());
			}
		}
	}
}
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product("Onion",100);
		Product p1=new Product("Tomato",5);
		Product p2=new Product("Potato",150);
		Inventory i=new Inventory();
		System.out.println("Add product is: ");
		i.addProduct(p);
		i.addProduct(p1);
		i.addProduct(p2);
		System.out.println("check low inventory: ");
		i.checkLowInventory();
		System.out.println("Remove "+p.getName()+" from the product");
		i.removeProduct(p);
		System.out.println("again check low inventory: ");
		i.checkLowInventory();
	}

}
