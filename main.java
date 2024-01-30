package BankManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
	static Scanner scanner;
	static int lastaccid = 0;
	private static ArrayList<Account> accounts;

	public static void main(String[] args) {
		
		accounts = new ArrayList<>();
		scanner = new Scanner(System.in);
		
		System.out.println("Welcome to bank management system");
		System.out.println("1. Create new account");
		System.out.println("2. Login with an existing accout");
		
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			new CreateAccount(scanner, lastaccid, accounts);
			break;
		case 2:
			new Login(scanner, accounts);
			break;
		}
		 
			
		
	}
	
	
}
