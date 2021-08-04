package com.codingdojo.bankaccountproject;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	public static int accountsCount = 0;
	public static double totalAmount = 0;
	
	// default constructor
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		accountsCount++;
	}
	
	// Constructor with 2 fields
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		accountsCount++;
		totalAmount += checkingBalance;
		totalAmount += savingsBalance;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	public static int getAccountsCount() {
		return accountsCount;
	}


	public static void setAccountsCount(int accountsCount) {
		BankAccount.accountsCount = accountsCount;
	}


	public static double getTotalAmount() {
		return totalAmount;
	}


	public static void setTotalAmount(double totalAmount) {
		BankAccount.totalAmount = totalAmount;
	}
	
	// deposit money to an account
	public void deposit(String accountType, double amount) {
		if(accountType.equals("savings")) {
			this.savingsBalance += amount;
			totalAmount += amount;
		}
		else if(accountType.equals("checking")) {
			this.checkingBalance += amount;
			totalAmount += amount;
		}
		else {
			System.out.println("Deposit failed");
		}
	}
	
	// withdraw money from checking account
	public void withdrawFromChecking(double amount) {
		if(amount > this.getSavingsBalance()) {
			System.out.println("Unsufficient funds");
		} else {
			this.checkingBalance -= amount;
			totalAmount -= amount;
		}
	}
	
	public double getSavPlusCheck() {
		double sum = (this.checkingBalance + this.savingsBalance);
		System.out.println("The total in both account is " + sum);
		return sum;
	}


}
