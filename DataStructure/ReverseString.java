package DataStructure;

public class ReverseString {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            charArray[start] ^= charArray[end];
            charArray[end] ^= charArray[start];
            charArray[start] ^= charArray[end];
            start++;
            end--;
        }
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String original = "Hello, world!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
