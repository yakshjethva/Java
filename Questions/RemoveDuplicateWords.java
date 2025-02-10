package Questions;

import java.util.HashSet;

public class RemoveDuplicateWords {
    public static String removeDuplicates(String input) {
        HashSet<String> uniqueWords = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (String word : input.split("\\s+")) { 
            if (uniqueWords.add(word)) { 
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Java is sdafsdf awesome sdafsdf sdafsdf sdafsdf and Java is sdafsdf sdafsdf fun sdafsdf fun";
        String output = removeDuplicates(input);
        System.out.println(output); // Output: "Java is awesome and fun"
    }
}
