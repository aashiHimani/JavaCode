package com.encapsulation;

class BankAccount{
	private String accountNumber;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		ba.setAccountNumber("A123QWE");
		ba.setBalance(50000.8789);
		System.out.println("Account number: "+ba.getAccountNumber()+" balance: "+ba.getBalance());
	}

}
