package com.oops;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String title;
	private String author;
	private String ISBN;
	private static List<Book> list=new ArrayList<Book>();
	public Book(String title, String author, String iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
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
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public static List<Book> getList() {
		return list;
	}
	public static void setList(List<Book> list) {
		Book.list = list;
	}
	public static void addBook(Book book) {
		list.add(book);
	}
	public static void removeBook(Book book) {
		list.remove(book);
	}
	
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("Java","James Ghosling","12345");
		Book b1=new Book("Python","Guido","67890");
		Book.addBook(b);
		Book.addBook(b1);
		System.out.println("list of books:");
		List<Book> list=Book.getList();
		for(Book book:list) {
			System.out.println("Book "+book.getTitle()+" wriiten by "+book.getAuthor()+" and ISBN no is "+book.getISBN());
		}
		Book.removeBook(b1);
		System.out.println("after removing books:"+b1.getTitle());
		for(Book book:list) {
			System.out.println("Book "+book.getTitle()+" wriiten by "+book.getAuthor()+" and ISBN no is "+book.getISBN());
		}
	}

}
