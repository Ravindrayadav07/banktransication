package com.string;

public class Bank {
	double amount;
	public Bank(double amount) {
		this.amount=amount;
	}
	public void widrawamount(double widrawamount) {
		String result=(amount>=widrawamount)?"successfully widraw":"insuffucinent balance";
		if(amount>=widrawamount) {
			amount-=widrawamount;
		}
		System.out.println(result);
	}
	public void deposit(double depositamount) {
		amount+=depositamount;
		System.out.println("Deposit successfully");
	}
	public void displaybalance() {
		System.out.println("total balance "+amount);
	}
public static void main(String[] args) {
	Bank a=new Bank(10000);
	a.widrawamount(3000);
	a.widrawamount(8000);
	a.deposit(5000);
	a.displaybalance();
	
}
}
