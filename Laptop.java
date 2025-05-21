package com.oops.constructor;

import java.util.Scanner;

public class Laptop {

	String brand;
	int ramSize;
	public Laptop(String Brand,int Ramsize){
		
		brand=Brand;
		ramSize=Ramsize;
	}
	public void showSpecs() {
		System.out.println("Laptop: "+brand +"\nRamSize: "+ramSize);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Laptop brand:");
		String  userBrand=sc.nextLine();
		System.out.print("Enter Ramsize of Laptop:");
		int userRamSize=sc.nextInt();
		
		Laptop l=new Laptop("Lenovo",64);
		l.showSpecs();
		Laptop lap=new Laptop(userBrand,userRamSize);
		lap.showSpecs();
		
		
		

	}

}
