package com.oops;

import java.util.ArrayList;
import java.util.Arrays;

class Movies{
	private String title;
	private String director;
	private ArrayList<String> actors;
	private ArrayList<Review> reviews;
	public Movies(String title, String director, ArrayList<String> actors) {
		super();
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.reviews = new ArrayList<Review>();
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public ArrayList<String> getActors() {
		return actors;
	}
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	public void addReview(Review review) {
		reviews.add(review);
	}
}
class Review{
	private String reviewText;
	private String reviwerName;
	private int rating;
	public Review(String reviewText, String reviwerName, int rating) {
		super();
		this.reviewText = reviewText;
		this.reviwerName = reviwerName;
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public String getReviwerName() {
		return reviwerName;
	}
	public int getRating() {
		return rating;
	}
}
public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies m=new Movies("Animal","Sandeep",new ArrayList<String>(Arrays.asList("Ranbir","Rashmika","Booby","Anil")));
		Review r=new Review("Great movies","Arun",4);
		Review r1=new Review("Highly recommentded","Tehelka",5);
		Review r2=new Review("Bole toh bawal","Anurag",3);
		Review r3=new Review("Good","Neil",3);
		
		m.addReview(r);
		m.addReview(r1);
		m.addReview(r2);
		m.addReview(r3);
		
		System.out.println("Reviews for "+m.getTitle()+":");
		for(Review re:m.getReviews()) {
			System.out.println(re.getReviewText()+" by "+re.getReviwerName()+" with "+re.getRating());
		}
	}

}
