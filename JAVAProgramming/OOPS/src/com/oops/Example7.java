package com.oops;

import java.util.ArrayList;

class Bank{
	private ArrayList<Account> accounts;

	public Bank() {
		accounts=new ArrayList<Account>();
	}
	public void addAccounts(Account account) {
		accounts.add(account);
	}
	public void removeAccounts(Account account) {
		accounts.remove(account);
	}
	public void depositMoney(Account account, double amount) {
		account.deposit(amount);
	}
	public void withdrawMoney(Account account, double amount) {
		account.withdraw(amount);
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
}
class Account{
	private String accountNo;
	private String accountHolderName;
	private double balance;
	public Account(String accountNo, String accountHolderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposit(double amount) {
		return balance+=amount;
	}
	public double withdraw(double amount) {
		return balance-=amount;
	}
	public String getDetails() {
		return "Name: "+accountHolderName+" ,Account number: "+accountNo+" ,balance: "+balance;
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("Himani", "A123qwe", 558907.09);
		Account a1=new Account("Soumya", "GH686ge", 6546567.0978);
		Account a2=new Account("Lucky", "KHG567DR", 8987646.63);
		
		Bank b=new Bank();
		b.addAccounts(a);
		b.addAccounts(a1);
		b.addAccounts(a2);
		
		ArrayList<Account> l=b.getAccounts();
		for(Account acc:l) {
			System.out.println(acc.getDetails());
		}
		System.out.println("\n"+" after deposit 1000 from account 1: ");
		b.depositMoney(a, 1000);
		System.out.println(a.getDetails()+"\n");
		
		System.out.println("after withdraw 1500 from account 2: ");
		b.depositMoney(a1, 1500);
		System.out.println(a1.getDetails());
	}

}
