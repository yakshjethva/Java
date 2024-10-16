package BasicDemo;

import java.util.Scanner;

public class EcommerceSalesAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = new String[7];
        int[] sales = new int[7];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter the name of product " + (i + 1) + ": ");
            products[i] = scanner.nextLine();
            System.out.print("Enter the number of sales for " + products[i] + ": ");
            sales[i] = scanner.nextInt();
            scanner.nextLine();
        }

        while (true) {
            System.out.print("Enter the product name to search for sales: ");
            String searchProduct = scanner.nextLine();
            int index = findProductIndex(products, searchProduct);

            if (index != -1) {
                System.out.println("Total sales for " + products[index] + ": " + sales[index]);
            } else {
                System.out.println("Product not found.");
            }

            System.out.print("Do you want to search for another product? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();
    }

    private static int findProductIndex(String[] products, String searchProduct) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(searchProduct)) {
                return i;
            }
        }
        return -1;
    }
}
