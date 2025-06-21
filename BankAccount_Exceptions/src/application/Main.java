package application;

import java.util.Scanner;
import entities.Account;
import exceptions.DomainException;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter Account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc1 = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.println(acc1);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		acc1.withdraw(amount);
		System.out.println("New balance: " + acc1.getBalance());		
		}catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
