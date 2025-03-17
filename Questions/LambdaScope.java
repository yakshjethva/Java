package Questions;

public class LambdaScope {
    public static void main(String[] args) {
        String greeting = "Hello";  
        Runnable r = () -> {
            greeting = "Goodbye";
            System.out.println(greeting + ", world!");
        };
        r.run();
    }
}
    