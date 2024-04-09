import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SwapVaraible {
    public static void main(String args[]) {
        String x = "String 1";
        String y = "String 2";

        String temp = "";

        // Tradition way for swapping
        temp = x;
        x = y;
        y = temp;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // XOR operator to swap
        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // Using String Concat
        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // Using Substring
        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        //CharArray
        char[] tempArray = x.toCharArray();
        x = y;
        y = new String(tempArray);

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // Using Collections
        List<String> list = Arrays.asList(x, y);
        Collections.swap(list, 0, 1);
        x = list.get(0);
        y = list.get(1);

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

    }
}
