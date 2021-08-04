package com.codingdojo.bankaccountproject;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		acc1.deposit("checking", 1000);
		acc1.deposit("savings", 2000);
		
		BankAccount acc2 = new BankAccount(2000, 3000);
		
		System.out.println(acc1.getCheckingBalance());
		System.out.println(acc1.getSavingsBalance());
		
		acc1.withdrawFromChecking(100);
		
		System.out.println("total in 2 accounts " + acc1.getSavPlusCheck());
		System.out.println("total in all accounts " + BankAccount.getTotalAmount());
	}

}
