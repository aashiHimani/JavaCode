package com.inheritance.main;

import java.util.ArrayList;
import java.util.List;

class Book{
	public String author;
	public String title;
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}
}

class Library{
	private final List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	public List<Book> getBooks() {
		return books;
	}
}
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Java","James goshling");
		Book b2=new Book("thinking in java","bruce");
		List<Book> b=new ArrayList<>();
		b.add(b1);
		b.add(b2);
		Library lib=new Library(b);
		List<Book> bk=lib.getBooks();
		for(Book book:bk) {
			System.out.println("title:"+book.title+" author:"+book.author);
		}
	}

}
