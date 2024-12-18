import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        // This Consumer plays with a toy (prints the number)
        Consumer<Integer> playWithNumber = (num) -> System.out.println("Playing with the number: " + num);  // Prints the number

        // Play with the number 5
        playWithNumber.accept(5);  // Output: Playing with the number: 5
    }
}

