package testserialization;

import java.io.*;

public class InSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("animals.dat"));
		Animal cat = (Animal) in.readObject();
		Animal dog = (Animal) in.readObject();
		in.close();
		
		System.out.println(cat.getName() + " " + dog.getName());
	}

}

