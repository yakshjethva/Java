import java.util.*;

public class TreeSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Hello");
        ts.add("World");
        ts.add("Wizard");
        ts.add("Is");
        ts.add("here!");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}