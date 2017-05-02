/*
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReadAsString {

	public static String readAsString(InputStream inputStream, Charset charset) throws IOException{
		Reader reader = new InputStreamReader(inputStream, charset);
        int chr;
        StringBuilder sb= new StringBuilder();
        while ((chr = reader.read())!=-1){
            sb.append((char)chr);
        }

        return sb.toString();
    }

}
