import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
      
        // file = An abstract representation of file and directory pathnames
        File file = new File("secret_message.txt");
        
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                // Write some text to the file if it already exists
                FileWriter fileWriter = new FileWriter(file, true); // Set append mode to true
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                // Write your text here
                bufferedWriter.write("Hello! This is some text written to the file.");
                bufferedWriter.newLine(); // Add a new line after writing text
                
                // Close the writers
                bufferedWriter.close();
                fileWriter.close();
                
                System.out.println("Text has been written to the file.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
