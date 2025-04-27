package com.oops;

import java.util.ArrayList;

class Restaurants{
	private ArrayList<String> menuItem;
	private ArrayList<Double> prices;
	private ArrayList<Integer> rating;
	private ArrayList<Integer> itemCount;
	public Restaurants() {
		this.menuItem = new ArrayList<String>();
		this.prices = new ArrayList<Double>();
		this.rating = new ArrayList<Integer>();
		this.itemCount = new ArrayList<Integer>();
	}
	public void addItem(String item,double price) {
		this.menuItem.add(item);
		this.prices.add(price);
		this.rating.add(0);
		this.itemCount.add(0);
	}
	public void removeItem(String item) {
		int index=this.menuItem.indexOf(item);
		if(index>=0) {
			this.menuItem.remove(index);
			this.prices.remove(index);
			this.rating.remove(index);
			this.itemCount.remove(index);
		}
	}
	public void addRating(String item,int rating){
		int index=this.menuItem.indexOf(item);
		if(index>=0) {
			int curentRating=this.rating.get(index);
			int totalCount=this.itemCount.get(index);
			this.rating.set(index, curentRating+totalCount);
			this.itemCount.set(index, totalCount+1);
		}
	}
	public double getAverageRating(String item){
		int index=this.menuItem.indexOf(item);
		if(index>=0) {
			int totalRating=this.rating.get(index);
			int itemCount=this.itemCount.get(index);
			return itemCount>0?(double) totalRating/itemCount:0.0;
		}
		else {
			return 0.0;
		}
	}
	public double calculateAverageRating(){
		double totalRating=0.0;
		int numRatig=0;
		for(int i=0;i<rating.size();i++) {
			totalRating+=rating.get(i);
			numRatig++;
		}
		return numRatig>0?totalRating/numRatig:0.0;
	}
	public void displayMenu() {
		for(int i=0;i<menuItem.size();i++) {
			System.out.println(menuItem.get(i)+" by Rs:"+prices.get(i)+"\n");
		}
	}
}
public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurants r=new Restaurants();
		r.addItem("Tea", 10.0);
		r.addItem("Coffee", 20.0);
		r.addItem("Sandwich", 50.0);
		r.addItem("Burger", 100.0);
		r.addItem("Pizza", 200.0);
		
		System.out.println("Menu and prices are:-");
		r.displayMenu();
		
		r.addRating("Tea", 4);
		r.addRating("Coffee", 3);
		r.addRating("Sandwich",5);
		r.addRating("Burger", 2);
		r.addRating("Pizza",3);
		r.addRating("Tea", 1);
		r.addRating("Coffee", 4);
		r.addRating("Sandwich",5);
		r.addRating("Pizza", 3);
		r.addRating("Tea", 2);
		r.addRating("Pizza", 4);
		r.addRating("Coffee", 5);
		r.addRating("Sandwich", 4);
		r.addRating("Burger", 4);
		
		System.out.println("Average rating of tea:-"+r.getAverageRating("Tea")+"\n");
		System.out.println("Average rating of coffee:-"+r.getAverageRating("Coffee")+"\n");
		System.out.println("Average rating of sandwich:-"+r.getAverageRating("Sandwich")+"\n");
		System.out.println("Average rating of burger:-"+r.getAverageRating("Burger")+"\n");
		System.out.println("Average rating of pizza:-"+r.getAverageRating("Pizza")+"\n");
		
		System.out.println("Average rating :-"+r.calculateAverageRating());
		
		r.removeItem("Tea");
		System.out.println("updated menu");
		r.displayMenu();
	}

}
