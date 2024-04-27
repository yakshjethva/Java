package DataStructure;
import java.util.Scanner;
import java.util.EmptyStackException;

public class StackWithArray {
    private int[] stack;
    private int top;
    private int maxSize;

    public StackWithArray(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1; // Initialize top to -1 (empty stack)
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stack[++top] = item; // Increment top and insert item
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
        return stack[top--]; // Decrement top and return item
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
        return stack[top]; // Return item at top of stack
    }

    public boolean isEmpty() {
        return (top == -1); // Check if stack is empty
    }

    public boolean isFull() {
        return (top == maxSize - 1); // Check if stack is full
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        StackWithArray stack = new StackWithArray(size); // Create a stack with user-specified size

        int choice;
        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. View Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 3:
                    try {
                        int peekedValue = stack.peek();
                        System.out.println("Peeked value: " + peekedValue);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot peek.");
                    }
                    break;
                case 4:
                    stack.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
