import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class PrintY {

	public static void main(String[] args) throws IOException {

		Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
		try {
			writer.write("Ы");
			writer.flush();
		} catch (IOException ex) {
			System.out.println("Ошибка ввода-вывода");
		}

	}

}
