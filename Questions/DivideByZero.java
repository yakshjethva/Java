package Questions;

public class DivideByZero {
    public static void main(String[] args) {
        
        System.out.println(10/0); //Exception
        System.out.println(0/0); //Exception
        System.out.println(10.0/0); //Infinity
        System.out.println(10.00f/0); //Infinity
        System.out.println(10/0.0); //Infinity
        System.out.println(0.0/0.0); //NaN
       
    }
}
