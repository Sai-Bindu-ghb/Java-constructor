package com.oops.constructor;

public class BankAccount {
	
	double balance;
	String customerName;
	String address;
	
	public BankAccount(double bal, String cusname,String add)
	{
		balance=bal;
		customerName=cusname;
		address=add;
		System.out.println("balance: "+bal+"\ncustomer Name: "+cusname+"\naddress:  "+add);
		
		
	}
	public BankAccount()
	{
		balance=0;
		customerName="Not Available";
		address="Not Available";
		System.out.println("balance: "+balance+"\ncustomer Name:  "+customerName+"\naddress:  "+ address);
		
	}
    public void deposit(double amount) {
		
		if(amount>0) {
			balance=balance+amount;
			System.out.println(balance);
		}
		else {
			System.out.println("invalid amount");
		}
	}
	public void withdraw(double amount) {
		
		if(amount<0) {
			System.out.println("invalid amount");
		}
		else if(amount>balance) {
			System.out.println("insufficient funds");
		}
		else {
		
			System.out.println(balance-amount);
		}
	}
	
	public void updateAddress(String newAddress) {
		address=newAddress;
		System.out.println(address);
		System.out.println("details updated successfully!");
	}
	public void updateCustomerName(String newCustomerName) {
		customerName=newCustomerName;
		System.out.println(customerName);
		System.out.println("details updated successfully!");
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		System.out.println("------------------------------");
		BankAccount b2=new BankAccount(10000.0,"bindu","nellore");
		System.out.println("-----------------------------");
		b2.deposit(1000);
		b2.withdraw(500);
		
		b2.updateAddress("Hyderabad");
		b2.updateCustomerName("triveni");
		
		
		

	}

}
