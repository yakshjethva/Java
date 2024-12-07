package Questions;
/* Demonstration of the singelton class with the synchronization */
public class SingletonDemo {

    private static volatile SingletonDemo instance;

    // To prevent instantiation
    private SingletonDemo() {
    }

    // Method to provide access to the instance
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo(); 
                }
            }
        }
        return instance;
    }
}
