public class AbstractionDemo {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling abstract methods
        circle.display();
        rectangle.display();
    }
}

// Abstract class representing a Shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double calculateArea();
    
    // Abstract method for displaying shape details
    abstract void display();
}

// Concrete subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing abstract method to display shape details
    @Override
    void display() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + calculateArea());
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implementing abstract method to display shape details
    @Override
    void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width + ", Area: " + calculateArea());
    }
}

