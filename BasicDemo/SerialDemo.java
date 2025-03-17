package BasicDemo;

import java.io.*;

public class SerialDemo {
	public static void main(String[] args) {
		Character myCharacter = new Character("Hero", 5, 1200, "11/11/2024");

		
		System.out.println("Original Character: " + myCharacter);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./BasicDemo/JagmeetSerialDemo.ser"))) {
			out.writeObject(myCharacter);
			System.out.println("Character saved!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		myCharacter = null;
		System.out.println("Character object removed from memory.");
	}
}
