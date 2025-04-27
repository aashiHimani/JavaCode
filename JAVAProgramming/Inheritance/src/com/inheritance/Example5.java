package com.inheritance;

class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(double amount) {
		balance+=amount;
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient amount...");
		}
	}
	public double getbalance() {
		return balance;
	}
}

class SavingsAccount extends BankAccount{

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}
	void withdraw(double amount) {
		if(getbalance()-amount<100) {
			System.out.println("minimum balance 100 required...");
		}
		else {
			super.withdraw(amount);
		}
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount obj= new SavingsAccount("A123",1200.0);
		obj.withdraw(500);
		System.out.println(obj.getbalance());
		obj.deposit(100);
		System.out.println(obj.getbalance());
		
	}

}
