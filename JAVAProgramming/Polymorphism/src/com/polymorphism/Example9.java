package com.polymorphism;

class BankAccount{
	private double balance;
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}

class SavingsAccount extends BankAccount{
	private double withdrwaLimit;
	public SavingsAccount(double initialBalance, double withdrwaLimit) {
		super(initialBalance);
		this.withdrwaLimit = withdrwaLimit;
	}
	public void withdraw(double amount) {
		if(amount<=withdrwaLimit) {
			super.withdraw(amount);
		}
		else {
			System.out.println("withdraw limit exceed");
		}
	}
}
class CheckingAccount extends BankAccount{
	private int overDreaftFee;
	public CheckingAccount(double initialBalance, int overDreaftFee) {
		super(initialBalance);
		this.overDreaftFee = overDreaftFee;
	}
	public void withdraw(double amount) {
		if(amount<=overDreaftFee) {
			super.withdraw(amount);
		}
		else {
			System.out.println(overDreaftFee+amount);
		}
	}

}
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s=new SavingsAccount(2000,600);
		CheckingAccount c=new CheckingAccount(1500,200);
		withdrawAccount(s,500);
		withdrawAccount(c,100);
		System.out.println("Savings account balance: "+s.getBalance());
		System.out.println("Checking account balance: "+c.getBalance());
	}
	public static void withdrawAccount(BankAccount ba,double amount) {
		ba.withdraw(amount);
	}
}