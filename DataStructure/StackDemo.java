package DataStructure;
/* Stack demo using the stack functions */

import java.util.Scanner;
public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

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
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int peekedValue = stack.peek();
                    if (peekedValue != -1) {
                        System.out.println("Peeked value: " + peekedValue);
                    }
                    break;
                case 4:
                    stack.viewStack();
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

class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray;
    private int top; // Top of the stack

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize top to -1 (empty stack)
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value; // Increment top and insert value
        System.out.println("Pushed " + value + " onto the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating failure
        }
        int poppedValue = stackArray[top--]; // Retrieve value and decrement top
        System.out.println("Popped " + poppedValue + " from the stack");
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value indicating failure
        }
        return stackArray[top]; // Return value at the top of the stack
    }

    public void viewStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Current stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (top == -1); // Check if stack is empty
    }

    public boolean isFull() {
        return (top == maxSize - 1); // Check if stack is full
    }
}

