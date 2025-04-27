package com.interfaces;

import java.util.ArrayList;

interface Account{
	public void deposit(double amount);
	public void withdraw(double amount);
	public double getBalance();
}

class SavingsAccount implements Account{
	private double balance;
	private double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}
	@Override
	public void withdraw(double amount) {
		balance-=amount;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	public void getInterest() {
		balance+=balance*interestRate/100;
	}
}

class CurrentAccount implements Account{
	private double balance;
	private double overDraftLimit;
	public CurrentAccount(double balance, double overDraftLimit) {
		super();
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}
	@Override
	public void withdraw(double amount) {
		if(balance+overDraftLimit>=amount) {
			balance-=amount;
		}
	}
	@Override
	public double getBalance() {
		return balance;
	}
	public void setOverDraftLimit() {
		this.overDraftLimit=overDraftLimit;
	}
}

class Bank {
	private ArrayList<Account> a;
	public Bank() {
		a=new ArrayList<>();
	}
	public void addAccount(Account account) {
		a.add(account);
	}public void removeaccount(Account account) {
		a.remove(account);
	}
	public void deposit(Account account, double amount) {
		account.deposit(amount);
	}
	public void withdraw(Account account, double amount) {
		account.withdraw(amount);
	}
	public void printAccountBalance() {
		for(Account account:a) {
			System.out.println("account balance:"+account.getBalance());
		}
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		SavingsAccount sa=new SavingsAccount(1000.0,4.7);
		CurrentAccount ca=new CurrentAccount(1500.0,6.3);
		bank.addAccount(sa);
		bank.addAccount(ca);
		System.out.println("deposit from saving account");
		bank.deposit(sa, 500);
		System.out.println("deposit from current account");
		bank.deposit(ca, 600);
		System.out.println("withdrw from saving account");
		bank.deposit(sa, 100);
		System.out.println("withdraw from saving account");
		bank.deposit(ca, 200);
		bank.printAccountBalance();
		sa.getInterest();
		bank.printAccountBalance();
	}

}
