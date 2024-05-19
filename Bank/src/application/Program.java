package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AccountBank acc;

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holderAccount = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		String response = sc.next();

		if (response.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			acc = new AccountBank(numberAccount, holderAccount, initialValue);
		} else {
			acc = new AccountBank(numberAccount, holderAccount);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(acc);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(acc);

		sc.close();
	}

}
