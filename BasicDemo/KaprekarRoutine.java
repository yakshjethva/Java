package BasicDemo;

import java.util.Arrays;

public class KaprekarRoutine {
    private static final int KAPREKAR_CONSTANT = 6174;
    public static void main(String[] args) {
        int number = 1222; 
        kaprekarRoutine(number);
    }

    public static void kaprekarRoutine(int num) {
        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a 4-digit number.");
            return;
        }

        System.out.println("Starting number: " + num);
        
        int iterations = 0;
        while (num != KAPREKAR_CONSTANT) {
            num = kaprekarStep(num);
            iterations++;
            if (num == KAPREKAR_CONSTANT) {
                System.out.println("Reached Kaprekar's constant 6174 in " + iterations + " iterations.");
                break;
            }
        }
    }

    private static int kaprekarStep(int num) {
        int[] digits = getDigits(num);

        Arrays.sort(digits);
        int ascending = getNumberFromDigits(digits, true);
        int descending = getNumberFromDigits(digits, false);

        int result = descending - ascending;
        System.out.printf("%d - %d = %d%n", descending, ascending, result);
        return result;
    }

    private static int[] getDigits(int num) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    private static int getNumberFromDigits(int[] digits, boolean ascending) {
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + (ascending ? digits[i] : digits[digits.length - 1 - i]);
        }
        return number;
    }
}

