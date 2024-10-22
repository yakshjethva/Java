package BasicDemo;

import java.lang.*;
import java.lang.reflect.Method;
import java.util.*;

import HackerRank.Anagrams;

public class Yaksh {

    // Capitalize the first letter of a string 
    public static String firstCharCapitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // Without doing method overloading process varaible number of parameters 
    public void add(int... numbers) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i != numbers.length - 1) {
                sb.append("+");
            }
        }
        
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        /* JAVA reflection demo */
        Class bankingClass = BankingSystem.class;
        Method[] methods = bankingClass.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();

        for (Method m : methods) {
            methodList.add(m.getName());
        }

        Collections.sort(methodList);
        
        for (String name : methodList) {
            System.out.println(name);
        }

    }

}
