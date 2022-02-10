package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	int selection;
	Scanner menuInput = new Scanner(System.in);

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	// Validate Login information customer number and pin number

	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {
				/*
				 * Accounts in a HashMap, key = customer number, value = pin number
				 */
				data.put(1234, 12);
				data.put(1235, 14);

				System.out.println("Welcome to the ATM Project!");

				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		} while (x == 1);
	}

	// Display Account Type Menu with selection

	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getCurrent();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank You for using ATM, have good day.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	/* Display Current Account Menu with selections */

	public void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Current Account Balance: " + getCurrentBalance() + "\n");
			getAccountType();
			break;

		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using ATM, have good day.");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getCurrent();
		}
	}

	// Display Saving Account Menu with selections

	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + getSavingBalance() + "\n");
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using ATM, have good day.");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getSaving();
		}
	}

}
