import java.util.function.*;

public class BiFunctionExample {
    public static void main(String[] args) {
        // This BiFunction adds two numbers together
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;  // Adds two numbers

        // Combine two numbers (3 and 4) to get a new number (7)
        System.out.println(addNumbers.apply(3, 4));  // Output: 7
    }
}
