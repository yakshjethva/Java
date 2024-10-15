package BasicDemo;

import java.util.Scanner;

public class ProductInventoryManagementDemo {
	String[] productNames = new String[5];
	double[] productPrices = new double[5];

	public void inputProducts() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < productNames.length; i++) {
			System.out.println("Enter the name of product " + (i + 1) + ": ");
			productNames[i] = scanner.nextLine();

			System.out.println("Enter the price of " + productNames[i] + ": ");
			productPrices[i] = scanner.nextDouble();
			scanner.nextLine();  
		}
	}

	public void displayProducts() {
		System.out.println("\nProduct Inventory:");
		for (int i = 0; i < productNames.length; i++) {
			System.out.println(productNames[i] + " - $" + productPrices[i]);
		}
	}

	public void searchProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the product name to search for its price: ");
		String searchName = scanner.nextLine();

		boolean found = false;
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i].equalsIgnoreCase(searchName)) {
				System.out.println(searchName + " is priced at $" + productPrices[i]);
				found = true;
				System.out.println("Do you want to find another item? : Yes / No ");
				String userChoice = scanner.nextLine();

				if(userChoice.equalsIgnoreCase("yes"))
				{
					searchProduct();
				}
			}
		}

		if (!found) {
			System.out.println("Product not found in inventory.");
			searchProduct();
		}
	}

	public static void main(String[] args) {
		ProductInventoryManagementDemo inventory = new ProductInventoryManagementDemo();

		inventory.inputProducts();

		inventory.displayProducts();

		inventory.searchProduct();
	}
}