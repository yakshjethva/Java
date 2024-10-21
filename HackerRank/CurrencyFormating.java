package HackerRank;
import java.util.*;
import java.text.*;


public class CurrencyFormating {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale us = Locale.US;
    	System.out.println("US: " + NumberFormat.getCurrencyInstance(us).format(payment));

    	Locale india = new Locale("en", "IN");
    	System.out.println("India: " + NumberFormat.getCurrencyInstance(india).format(payment));

    	Locale china = Locale.CHINA;
    	System.out.println("China: " + NumberFormat.getCurrencyInstance(china).format(payment));

    	Locale france = Locale.FRANCE;
    	System.out.println("France: " + NumberFormat.getCurrencyInstance(france).format(payment));
    }
}