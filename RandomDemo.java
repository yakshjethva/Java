import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt() ;
        // we can set the bound with parameter 
        // int x = random.nextInt(10); This will generate number from 0 to 9
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();

        System.out.println(x);
    }
}
