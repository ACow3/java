package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount();
		
		System.out.println("Bank Account Number: " + b.getAccountNumber());
		System.out.println("Bank Account Number: " + b1.getAccountNumber());
		
		
	
		b.deposit("checking", 2000.0);
		b.deposit("savings", 5000.0);
		
		
		System.out.println("Checking Balance: " + b.getChecking());
		
		System.out.println("Savings Balance: " + b.getSavings());
		
		System.out.println(BankAccount.getTotal());
		System.out.println("Total number of accounts: " + BankAccount.getNumberOfAccounts());
	}

}