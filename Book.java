package com.oops.constructor;

public class Book {
	String title;
	String authour;
	
	public Book(String tle,String autr) {
		title=tle;
		authour=autr;
		
	}
	public void display() {
		System.out.println("Title of the book: "+title +"\nAuthour of the book: "+authour);
	}

	public static void main(String[] args) {
		Book b=new Book("Brave New World","Aldous Huxley");
		b.display();
	}

}
