package BasicDemo;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        double balance = 0.0;
        String setPIN;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Laxmi Cheat Fund!");
        System.out.print("Please set your 4-digit PIN: ");
        setPIN = scanner.nextLine();

        while (setPIN.length() != 4 || !setPIN.matches("\\d{4}")) {
            System.out.print("Invalid PIN. Please enter a 4-digit number: ");
            setPIN = scanner.nextLine();
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2: 
                case 3: 
                    System.out.print("Please enter your PIN to proceed: ");
                    String enteredPIN = scanner.next();
                    
                    if (enteredPIN.equals(setPIN)) {
                        if (choice == 2) {
                            System.out.print("Enter amount to deposit: ");
                            double deposit = scanner.nextDouble();
                            if (deposit > 0) {
                                balance += deposit;
                                System.out.println("$" + deposit + " has been deposited to your account.");
                            } else {
                                System.out.println("Deposit amount must be positive.");
                            }
                        } else {
                            System.out.print("Enter amount to withdraw: ");
                            double withdraw = scanner.nextDouble();
                            if (withdraw > 0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("$" + withdraw + " has been withdrawn from your account.");
                            } else if (withdraw > balance) {
                                System.out.println("Insufficient funds. Your balance is only $" + balance);
                            } else {
                                System.out.println("Withdrawal amount must be positive.");
                            }
                        }
                    } else {
                        System.out.println("Incorrect PIN. Transaction cancelled.");
                    }
                    break;
                case 4: 
                    System.out.println("Thank you for using the Laxmi Cheat Fund!. Goodbye!");
                    exit = true;
                    break;
                default: 
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
}

