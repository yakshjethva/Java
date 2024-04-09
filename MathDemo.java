import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        double PI = 3.14;
        double x = -10;

        //Comparing two variables 
        System.out.println(Math.max(PI,x));
        System.out.println(Math.min(PI,x));

        //Get the Absolute value 
        System.out.println(Math.abs(x));

        // Outputs: NaN for the negative number 
        System.out.println(Math.sqrt(PI));
        System.out.println(Math.sqrt(x));

        //Round off the value
        System.out.println(Math.round(PI));

        // Round up and down 
        System.out.println(Math.ceil(PI));
        System.out.println(Math.floor(PI));

        // Area of the triangle
        double side1,side2,hypotenuse;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side Side 1: ");
        side1 = scanner.nextDouble();

        System.out.println("Enter Side Side 2: ");
        side2 = scanner.nextDouble();

        // Formula sqre((x*x)+(y*y))
        hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));

        System.out.println("Hypotenuse of the triabnlge is: " + hypotenuse);

        scanner.close();
    }
}