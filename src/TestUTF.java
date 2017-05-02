import java.io.IOException;

public class TestUTF {
	
	public static void main(String[] args) throws IOException{
		
		String example = "Ы";
		byte[] bytes = example.getBytes();
		for(int i = 0; i < bytes.length; i++){
			System.out.println(Byte.toUnsignedInt(bytes[i]));
		}
	
	}

}
