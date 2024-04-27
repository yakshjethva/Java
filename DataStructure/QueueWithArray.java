package DataStructure;

import java.util.Scanner;

public class QueueWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        
        Queue queue = new Queue(size);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Check if the queue is empty");
            System.out.println("4. Check if the queue is full");
            System.out.println("5. Get the size of the queue");
            System.out.println("6. Display the queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println("Dequeued item: " + dequeuedItem);
                    }
                    break;
                case 3:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;
                case 4:
                    System.out.println("Is the queue full? " + queue.isFull());
                    break;
                case 5:
                    System.out.println("Size of the queue: " + queue.size());
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        
        scanner.close();
    }
}

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = item;
            currentSize++;
        } else {
            System.out.println("Queue is full. Cannot enqueue item: " + item);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements of the queue:");
        int index = front;
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % maxSize;
        }
        System.out.println();
    }
}
