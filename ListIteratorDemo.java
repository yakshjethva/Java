import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ListIterator<String> iterator = colors.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();

            if (color.equals("Green")) {
                iterator.set("Yellow"); 
            }
            if (color.equals("Blue")) {
                iterator.add("Purple"); 
            }
        }

        System.out.println("Modified List: " + colors);
    }
}
