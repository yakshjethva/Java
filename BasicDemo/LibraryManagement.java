package BasicDemo;

import java.util.Scanner;

public class LibraryManagement {
    String[] bookNames = new String[6];

    public void inputBooks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < bookNames.length; i++) {
            System.out.println("Enter the name of book " + (i + 1) + ": ");
            bookNames[i] = scanner.nextLine();
        }

		scanner.close();
    }

    public void displayBooks() {
        System.out.println("\nList of the Books:");
        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
    }

    public void searchBook() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter the book name to search: ");
            String searchName = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < bookNames.length; i++) {
                if (bookNames[i].equalsIgnoreCase(searchName)) {
                    System.out.println("Yay!! We found the book you are looking for at index " + i + ".");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found in our list.");
            }

            System.out.println("Do you want to search for another book? (yes/no): ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (!userChoice.equals("yes")) {
                System.out.println("Exiting search.");
                break;
            }
        }
		scanner.close();
    }

    public void updateBook() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter the book name you want to update: ");
            String oldBookName = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < bookNames.length; i++) {
                if (bookNames[i].equalsIgnoreCase(oldBookName)) {
                    System.out.println("Enter the new book title to replace \"" + oldBookName + "\": ");
                    String newBookName = scanner.nextLine();
                    bookNames[i] = newBookName;
                    System.out.println("The book \"" + oldBookName + "\" has been updated to \"" + newBookName + "\".");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found in our list.");
            }

            System.out.println("Do you want to update another book? (yes/no): ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (!userChoice.equals("yes")) {
                System.out.println("Exiting update process.");
                break;
            }
        }
		scanner.close();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Search for a Book");
            System.out.println("2. Update a Book");
            System.out.println("3. View the List of Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    searchBook();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
				}
			scanner.close();
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.inputBooks();
        library.displayBooks();

        library.displayMenu();
    }
}
