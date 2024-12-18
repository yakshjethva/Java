import java.util.function.*;

public class SupplierExample {
    public static void main(String[] args) {
        // This Supplier gives you a random number
        Supplier<Integer> giveRandomNumber = () -> (int)(Math.random() * 100);  // Gives a random number

        // Asking the Supplier for a random number and printing it
        System.out.println(giveRandomNumber.get());  // Example output: 42
    }
}
