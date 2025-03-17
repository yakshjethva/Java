package Questions;

public class FinallyQuestion {
    public static void main(String[] args) {

            try {
                 System.exit(0);   
            } catch (Exception e) {
            } finally {
                System.out.println("Finally block will not execute.");
            }
        
        
    }
}
