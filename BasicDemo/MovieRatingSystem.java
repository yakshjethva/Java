package BasicDemo;

import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] movies = new String[5];
        int[] ratings = new int[5];

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Enter movie name " + (i + 1) + ":");
            movies[i] = scanner.nextLine();

            int rating;
            do {
                System.out.println("Enter rating for " + movies[i] + " (between 0 and 5):");
                rating = scanner.nextInt();
            } while (rating < 0 || rating > 5); // Corrected condition: loop until rating is between 0 and 5

            ratings[i] = rating;
            scanner.nextLine(); // Consume newline left by nextInt
        }

        int highestRating = ratings[0];
        String bestMovie = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (ratings[i] > highestRating) {
                highestRating = ratings[i];
                bestMovie = movies[i];
            }
        }

        System.out.println("The movie with the highest rating is: " + bestMovie + " with a rating of " + highestRating);
        scanner.close();
    }
}
