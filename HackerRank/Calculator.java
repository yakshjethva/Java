package HackerRank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(2, 3);
        assertEquals(expected, actual, "The add method should correctly sum two numbers.");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.subtract(5, 3);
        assertEquals(expected, actual, "The subtract method should correctly subtract two numbers.");
    }
}
