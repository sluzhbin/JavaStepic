package testserialization;

import java.io.*;

public class OutSerialize {

	public static void main(String[] args) throws IOException {
		Animal cat = new Animal("Cat");
		Animal dog = new Animal("Dog");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("animals.dat"));
		out.writeObject(cat);
		out.writeObject(dog);
		out.close();

		System.out.println("I have written.");
	}

}
