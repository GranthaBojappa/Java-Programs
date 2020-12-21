package com.xworkz.encapsulation;

public class Bank {

	public String acctNum;
	public double balance;
	public String name;
	public String branch;

	public Bank(String inacctNum, String inname, String inbranch) {
		acctNum = inacctNum;
		name = inname;
		branch = inbranch;
		balance = 10000.0;
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawal of amount: " + amount);

		if (amount > 0 && balance > amount) {
			balance -= amount;
			System.out.println("Balance after withdrawal: " + balance);
		} else
			System.out.println("Enter amount more than 0");
	}

	public void deposit(double amount) {
		System.out.println("Deposit of amount: " + amount);
		if (amount > 0)
			balance += amount;
		System.out.println("Balance after deposit: " + balance);
	}

	public void miniStatement() {
		System.out.println("For AcctNum: " + acctNum + " Current BALANCE is: " + balance);
	}
}
