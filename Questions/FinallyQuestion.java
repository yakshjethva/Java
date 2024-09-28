package Questions;

/* Will Finally block execute or not? */
public class FinallyQuestion {
    public static void main(String[] args) {
        
            try {
                System.exit(0);
            } catch (Exception e) {
                // Handle exception
            } finally {
                System.out.println("Finally block will not execute.");
            }
        
        
    }
}
