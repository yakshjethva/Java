import javax.swing.JOptionPane;

public class GUIDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //By Default JOptionPane.showInputDialog return string so converting String to Int 
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        //By Default JOptionPane.showInputDialog return string so converting String to Double 
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
