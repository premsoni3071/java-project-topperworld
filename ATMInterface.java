package javaproject;
import java.util.Scanner;
	
	public class ATMInterface {
	    private static double accountBalance = 1000.0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean isRunning = true;

	        while (isRunning) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Funds");
	            System.out.println("3. Withdraw Funds");
	            System.out.println("4. Exit");
	            System.out.print("Please select an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    depositFunds(scanner);
	                    break;
	                case 3:
	                    withdrawFunds(scanner);
	                    break;
	                case 4:
	                    isRunning = false;
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }

	        scanner.close();
	    }

	    public static void checkBalance() {
	        System.out.println("Your account balance is: $" + accountBalance);
	    }

	    public static void depositFunds(Scanner scanner) {
	        System.out.print("Enter the amount to deposit: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0) {
	            accountBalance += amount;
	            System.out.println("Deposit successful. Your new balance is: $" + accountBalance);
	        } else {
	            System.out.println("Invalid amount. Please enter a positive amount.");
	        }
	    }

	    public static void withdrawFunds(Scanner scanner) {
	        System.out.print("Enter the amount to withdraw: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0 && amount <= accountBalance) {
	            accountBalance -= amount;
	            System.out.println("Withdrawal successful. Your new balance is: $" + accountBalance);
	        } else if (amount <= 0) {
	            System.out.println("Invalid amount. Please enter a positive amount.");
	        } else {
	            System.out.println("Insufficient funds. Your account balance is: $" + accountBalance);
	        }
	    }
	}
