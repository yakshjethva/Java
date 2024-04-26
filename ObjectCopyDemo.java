public class ObjectCopyDemo {
    public static void main(String[] args) {
        // Creating an original Person object
        Person originalPerson = new Person("John", 30);

        try {
            // Method 1: Using copy constructor
            Person copiedPerson1 = new Person(originalPerson);
            
            // Method 2: Using clone() method
            Person copiedPerson2 = (Person) originalPerson.clone();
            
            // Method 3: Manual field-by-field copying
            Person copiedPerson3 = new Person("", 0); // Create an empty object
            copiedPerson3.copyFrom(originalPerson);

            // Displaying details of all copied objects
            System.out.println("Method 1 (Copy Constructor): " + copiedPerson1.getName() + ", Age: " + copiedPerson1.getAge());
            System.out.println("Method 2 (Clone Method): " + copiedPerson2.getName() + ", Age: " + copiedPerson2.getAge());
            System.out.println("Method 3 (Manual Copy): " + copiedPerson3.getName() + ", Age: " + copiedPerson3.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Cloneable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Override clone() method to support object cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    // Method for manual field-by-field copying
    public void copyFrom(Person original) {
        this.name = original.name;
        this.age = original.age;
    }
}

