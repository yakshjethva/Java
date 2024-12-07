package BasicDemo;

import java.io.*;

public class DeserialDemo {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("./BasicDemo/serialDemo.ser"))) {
			Character loadedCharacter = (Character) in.readObject();
			System.out.println("Loaded Character: " + loadedCharacter);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
