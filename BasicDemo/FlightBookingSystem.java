package BasicDemo;
import java.util.Scanner;

public class FlightBookingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] destinations = new String[5];

        System.out.println("Please enter 5 destinations:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Search for a destination");
            System.out.println("2. Update a destination");
            System.out.println("3. View all destinations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    searchDestination(destinations, scanner);
                    break;
                case 2:
                    updateDestination(destinations, scanner);
                    break;
                case 3:
                    viewDestinations(destinations);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void searchDestination(String[] destinations, Scanner scanner) {
        System.out.print("Enter the destination name to search: ");
        String searchName = scanner.nextLine().trim();

        boolean found = false;
        for (String destination : destinations) {
            if (destination.equalsIgnoreCase(searchName)) {
                System.out.println("Destination " + searchName + " is available.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Destination not found.");
        }
    }

    public static void updateDestination(String[] destinations, Scanner scanner) {
        System.out.print("Enter the destination name you want to update: ");
        String oldDestination = scanner.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < destinations.length; i++) {
            if (destinations[i].equalsIgnoreCase(oldDestination)) {
                System.out.print("Enter the new destination name: ");
                destinations[i] = scanner.nextLine();
                System.out.println("Destination has been updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Destination not found.");
        }
    }

    public static void viewDestinations(String[] destinations) {
        System.out.println("\nList of all destinations:");
        for (int i = 0; i < destinations.length; i++) {
            System.out.println((i + 1) + ". " + destinations[i]);
        }
    }
}
