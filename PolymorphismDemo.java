
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects of different types but treated as objects of Animal class
        Animal animal1 = new Dog(); // Polymorphism - Dog object treated as Animal
        Animal animal2 = new Cat(); // Polymorphism - Cat object treated as Animal

        // Calling makeSound method on different objects
        animal1.makeSound(); // Outputs "Dog barks"
        animal2.makeSound(); // Outputs "Cat meows"
    }
}

// Base class Animal
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Method overriding to make specific sound for Dog
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Method overriding to make specific sound for Cat
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
