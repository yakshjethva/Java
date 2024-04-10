public class ObjectDemo 
{
    private String brand;
    private String model;
    private int year;

    // Constructor
    public ObjectDemo(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public ObjectDemo() {
        
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public void startEngine() {
        System.out.println("The " + brand + " " + model + " engine has started.");
    }

    public void stopEngine() {
        System.out.println("The " + brand + " " + model + " engine has stopped.");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Car
        ObjectDemo demo = new ObjectDemo();
        // This will print the hex code of the memory address for the object. i.e. ObjectDemo@120d6fe6
        System.out.println(demo);

        ObjectDemo myCar = new ObjectDemo("Toyota", "Camry", 2020);

        // Access object properties
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Modify object properties
        myCar.setYear(2022);

        // Call object methods
        myCar.startEngine();
        myCar.stopEngine();
    }
}