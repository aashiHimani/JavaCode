package com.oops;

import java.util.ArrayList;

class Books{
	private String title;
	private String author;
	public Books(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
class Librarys{
	private ArrayList<Books> books;

	public Librarys() {
		books= new ArrayList<Books>();
	}

	public ArrayList<Books> getBooks() {
		return books;
	}
	public void addBooks(Books book) {
		books.add(book);
	}
	public void removeBooks(Books book) {
		books.remove(book);	
	}
	
}
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b=new Books("Java","James");
		Books b1=new Books("Python","Guidpo");
		Books b2=new Books("Sql","Donald");
		
		Librarys lib=new Librarys();
		lib.addBooks(b);
		lib.addBooks(b1);
		lib.addBooks(b2);
		
		System.out.println("Book in library is:");
		for(Books book:lib.getBooks()) {
			System.out.println(book.getAuthor()+" by "+book.getAuthor());
		}
		
		lib.removeBooks(b);
		System.out.println("after removing Book in library is:");
		for(Books book:lib.getBooks()) {
			System.out.println(book.getAuthor()+" by "+book.getAuthor());
	}
	}

}
