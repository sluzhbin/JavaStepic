import java.io.*;

/**
 * Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor bn+1Cn+1=rotateLeft(Cn) xor bn+1 , где CnCn — контрольная сумма первых n байт данных, 
rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), bnbn — n-ный байт данных.
Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно выбрасываться из метода.

Пример
На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. 
В качестве контрольной суммы должно быть возвращено число 71.
 *
 */

public class TestInputStream {
	
	public static void main(String[] args) throws IOException{
		
		byte[] data = {0x33, 0x45, 0x01};
		InputStream inputStream = new ByteArrayInputStream(data);
		int result = checkSumOfStream(inputStream);
        System.out.println(result);

	}
	
	public static int checkSumOfStream(InputStream inputStream) throws IOException {

		int result = 0;
		int data;
		try{
			while((data = inputStream.read()) != -1) {
				result = Integer.rotateLeft(result, 1)^data;
		}
			return result;
		} catch(IOException e){
			throw new IOException();
		}
		
}
}
