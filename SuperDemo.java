
public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("--- Using super to call superclass method ---");
        child.display(); // Calling overridden method

        System.out.println("--- Accessing superclass field ---");
        child.printParentMessage(); // Accessing superclass field

        System.out.println("--- Using super to call superclass method with parameters ---");
        child.printMessageWithPrefix("Message"); // Calling overridden method and accessing subclass field
    }
}

class Parent {
    String message = "Hello from Parent";

    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    String message = "Hello from Child";

    // Using super to call superclass constructor
    Child() {
        super(); // Calling superclass constructor
        System.out.println("Child's constructor");
    }

    // Using super to call superclass method
    @Override
    void display() {
        super.display(); // Calling superclass method
        System.out.println("Child's display method");
    }

    // Accessing superclass field
    void printParentMessage() {
        System.out.println(super.message); // Accessing superclass field
    }

    // Using super to call superclass method with parameters
    void printMessageWithPrefix(String prefix) {
        super.display(); // Calling superclass method
        System.out.println(prefix + ": " + message); // Accessing subclass field
    }
}


