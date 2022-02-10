package com;

import java.util.Scanner;

public class Account {

	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;

	Scanner input = new Scanner(System.in);

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public double setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
		return currentBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
		return savingBalance;
	}

	// current account withdrawal

	public double calcCurrentWithdaw(double amount) {
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}

	// current account withdrawal

	public double calcSavingWithdaw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	// current account deposit
	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
	}

	// saving account deposit

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	// Customer Current Account Withdraw input

	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + currentBalance);
		System.out.print("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();

		if ((currentBalance - amount) >= 0) {
			calcCurrentWithdaw(amount);
			System.out.println("New Current Account balance: " + currentBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	// Customer Saving Account Withdraw input

	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + savingBalance);
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdaw(amount);
			System.out.println("New Saving Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	// Customer Current Account Deposit input

	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + currentBalance);
		System.out.print("Amount you want to deposit from Current Account: ");
		double amount = input.nextDouble();

		if ((currentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account balance: " + currentBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	// Customer Saving Account Deposit input

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + savingBalance);
		System.out.print("Amount you want to deposit from Saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

}
