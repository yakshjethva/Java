package HackerRank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() != b.length()) {
            return false;
        }
        
        int[] charCount = new int[26]; 
        
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++; 
            charCount[b.charAt(i) - 'a']--; 
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
