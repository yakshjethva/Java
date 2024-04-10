public class EncapsulationDemo {
    // Encapsulation in Java isn't about locking variables away; 
    // it's about setting rules for how they're used. 
    // By making variables private and providing getters and setters,
    // you control how data is accessed and modified. 
    // This helps maintain the reliability and consistency of your class's data.
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(25);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

class Student {
    // Private fields
    private String name;
    private int age;

    // Public getter and setter methods to access and modify the private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
