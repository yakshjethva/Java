import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // this nextline is used to reset the scanner with \n of the previous input
        scanner.nextLine();

        System.out.println("Type something interesting: ");
        String slang = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");
        System.out.println("That is interesting " + slang );

        scanner.close();
    }
}
