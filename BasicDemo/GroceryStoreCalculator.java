package BasicDemo;

import java.util.Scanner;

public class GroceryStoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruitNames = new String[5];
        double[] fruitPrices = new double[5];

        System.out.println("Please enter the names and prices for 5 fruits.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of fruit " + (i + 1) + ": ");
            fruitNames[i] = scanner.nextLine();

            System.out.print("Enter the price per kilogram for " + fruitNames[i] + ": ");
            fruitPrices[i] = scanner.nextDouble();
            scanner.nextLine();  
        }

        while (true) {
            System.out.println("Available fruits: ");
            for (String fruit : fruitNames) {
                System.out.print(fruit + " ");
            }
            System.out.println();

            System.out.print("Enter the fruit name: ");
            String fruitName = scanner.nextLine().trim();

            int index = -1;
            for (int i = 0; i < fruitNames.length; i++) {
                if (fruitNames[i].equalsIgnoreCase(fruitName)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.print("Enter the number of kilograms: ");
                double kilograms = scanner.nextDouble();
                scanner.nextLine();  

                double totalPrice = fruitPrices[index] * kilograms;
                System.out.println("Total price for " + kilograms + " kg of " + fruitNames[index] + " is: $" + totalPrice);
            } else {
                System.out.println("Sorry, the fruit you entered is not available.");
            }

            System.out.print("Do you want to calculate the price again? yes/no: ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (!choice.equals("yes")) {
                System.out.println("Thank you!");
                break;
            }
        }

        scanner.close();
    }
}
