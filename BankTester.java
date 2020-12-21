package com.xworkz.encapsulation;

public class BankTester {

	public static void main(String[] args) {
		
		Bank canaraacct = new Bank("17075", "Grantha", "Gonikoppal");
		
		System.out.println("Account Number: " +canaraacct.acctNum);
		System.out.println("Name: " +canaraacct.name);
		System.out.println("Branch: " +canaraacct.branch);
		System.out.println("Balance: " +canaraacct.balance);
		
		canaraacct.withdraw(2000.00);
		
		canaraacct.deposit(1000.00);
		
		canaraacct.miniStatement();

	}

}

// OUTPUT:-
/*
Account Number: 17075
Name: Grantha
Branch: Gonikoppal
Balance: 10000.0
Withdrawal of amount: 2000.0
Balance after withdrawal: 8000.0
Deposit of amount: 1000.0
Balance after deposit: 9000.0
For AcctNum: 17075 Current BALANCE is: 9000.0
*/