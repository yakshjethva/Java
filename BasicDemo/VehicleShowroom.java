package BasicDemo;

class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);  
        this.doors = doors;
    }

    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    private String type;

    public Bike(String brand, int speed, String type) {
        super(brand, speed);  
        this.type = type;
    }

    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Type: " + type);
    }
}

public class VehicleShowroom {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, 4);
        System.out.println("Car Info:");
        myCar.displayInfo();
        
        System.out.println();  

        Bike myBike = new Bike("Yamaha", 220, "Sports Bike");
        System.out.println("Bike Info:");
        myBike.displayInfo();
    }
}

