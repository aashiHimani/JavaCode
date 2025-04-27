package com.interfaces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

interface Searchable{
	boolean search(String keyword);
}

class Document implements Searchable{
	private String content;
	public Document(String content) {
		super();
		this.content = content;
	}
	@Override
	public boolean search(String keyword) {
		return content.contains(keyword);
	}
	
}

class WebPage implements Searchable{
	private String url;
	private String htmlContent;
	public WebPage(String url, String htmlContent) {
		super();
		this.url = url;
		this.htmlContent = htmlContent;
	}
	@Override
	public boolean search(String keyword) {
		return htmlContent.contains(keyword);
	}
	
}
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc=new Document("This is sample document");
		boolean documentContainsKeyword=doc.search("sample");
		System.out.println("document contain "+documentContainsKeyword);
		WebPage web=new WebPage("https://www.w3resource.com", "This is a sample webpage.");
		boolean webPageContainsKeyword=web.search("sample");
		System.out.println("document contain "+webPageContainsKeyword);
	}

}
