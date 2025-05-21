package com.oops.constructor;

public class Employee {

	String name;
	double salary;
	
	public Employee(String na, double sal) {
		
		name=na;
		salary=sal;
		
		if(salary<0) {
			
			salary=0;
			
		}
	}
	public void displayDetails() {
		
			System.out.println("Employee Name: "+name +"\nEmployee salary:"+salary);
			
	}
	public static void main(String[] args) {
		
		Employee e=new Employee("Bindu",-1);
		e.displayDetails();
		

	}

}
