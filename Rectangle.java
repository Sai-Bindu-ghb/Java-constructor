package com.oops.constructor;

public class Rectangle {
       
	int length;
	int breadth;
	
	public Rectangle() {
		System.out.println("length: "+length +"\nbreadth: "+breadth);
	}
	public Rectangle(int len,int brth) {
		length=len;
		breadth=brth;
	}
	
	public int area() {
		return length*breadth;
	}
	public static void main(String[] args) {
		
    Rectangle r=new Rectangle();
    Rectangle r1=new Rectangle(20,30);
    System.out.println("area of reactangle:"+r1.area());
    
    
	}

}
