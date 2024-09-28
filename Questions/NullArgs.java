package Questions;

/* Pass null argument with method overloading */
public class NullArgs {
    public static void main(String[] args) {
        overloading(null);
    }
    public static void overloading(Object o)
    {
        System.out.println("Object Argument");
    }
    public static void overloading(String o)
    {
        System.out.println("String Argument");
    }
}
