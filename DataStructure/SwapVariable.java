package DataStructure;

public class SwapVariable {
    public static void main(String args[])
    {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Method 1: Using a Temporary Variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter swapping with temporary variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Method 2: Using Arithmetic Operations
        a = 5;
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swapping with arithmetic operations:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Method 3: Using XOR Operation
        a = 5;
        b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("\nAfter swapping with XOR operation:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Method 4: Using a Single Statement
        a = 5;
        b = 10;
        b = (a + b) - (a = b);
        System.out.println("\nAfter swapping with single statement:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}