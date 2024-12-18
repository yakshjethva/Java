import java.util.function.*;

public class PredicateExample {
    public static void main(String[] args) {
        // This Predicate checks if a number is even
        Predicate<Integer> isEven = (num) -> num % 2 == 0;  // Checks if the number is even

        // Asking if the number 4 is even (true) or 7 is even (false)
        System.out.println(isEven.test(4));  // Output: true (4 is even)
        System.out.println(isEven.test(7));  // Output: false (7 is not even)
    }
}
