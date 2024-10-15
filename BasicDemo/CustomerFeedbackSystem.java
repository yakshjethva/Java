package BasicDemo;

import java.util.Scanner;

public class CustomerFeedbackSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] reviews = new String[5];

        System.out.println("Please enter up to 5 customer reviews:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter review " + (i + 1) + ": ");
            reviews[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display all customer reviews");
            System.out.println("2. Search for specific words in reviews");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    displayReviews(reviews);
                    break;
                case 2:
                    searchReviews(reviews, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayReviews(String[] reviews) {
        System.out.println("\nCustomer Reviews:");
        for (int i = 0; i < reviews.length; i++) {
            System.out.println((i + 1) + ". " + reviews[i]);
        }
    }

    public static void searchReviews(String[] reviews, Scanner scanner) {
        System.out.print("Enter a word to search for in the reviews: ");
        String searchWord = scanner.nextLine().trim();

        boolean found = false;
        System.out.println("Reviews containing \"" + searchWord + "\":");
        for (String review : reviews) {
            if (review.toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(review);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching reviews found.");
        }
    }
}

