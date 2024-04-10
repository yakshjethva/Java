public class AbstractDemo {
    public static void main(String[] args) {
        Shape.printInfo();
        Circle circle = new Circle();
        circle.draw();
        circle.sleep();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Dog dog = new Dog();
        dog.draw();
        dog.makeSound();
        dog.sleep();
    }
}

abstract class Shape {
    abstract void draw(); // Abstract method
    abstract void makeSound(); // Abstract method
    
    // Constructor
    Shape() {
        System.out.println("Shape constructor called");
    }

    // Concrete method
    void sleep() {
        System.out.println("Shape is sleeping");
    }

    // Static method
    static void printInfo() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    void makeSound() {
        System.out.println("Circle sound");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    void makeSound() {
        System.out.println("Rectangle sound");
    }
}

class Dog extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a dog");
    }

    @Override
    void makeSound() { // Implementing makeSound method from Shape
        System.out.println("Dog barks");
    }
}
