package com.oops.constructor;

public class Circle {
	double radius;
	
	public Circle(double r) {
		
		radius=r;
	}
	
	public double getArea(){
	
		return radius*radius;
		
	}
	public double getCircumference(){
		
		double pi=3.14;
		return 2*pi*radius;
	}
	public static void main(String args[]) {
		Circle c=new Circle(3);
		
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());
		
	}

}
