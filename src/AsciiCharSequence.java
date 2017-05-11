import java.util.Arrays;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение
 * последовательности ASCII-символов (их коды влезают в один байт) в массиве
 * байт. По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 *
 * - реализовывать интерфейс java.lang.CharSequence; - иметь конструктор,
 * принимающий массив байт; - определять методы length(), charAt(),
 * subSequence() и toString()
 *
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса
 * java.lang.CharSequence (JavaDoc или исходники).
 *
 * В данном задании методам charAt() и subSequence() всегда будут подаваться
 * корректные входные параметры, поэтому их проверкой и обработкой ошибок
 * заниматься не нужно. Тем более мы еще не проходили исключения.
 */
public class AsciiCharSequence implements CharSequence {
	byte[] bytes;

	AsciiCharSequence(byte[] b) {
		this.bytes = b;
	}

	public int length() {
		return this.bytes.length;
	}

	public char charAt(int index) {
		return (char) this.bytes[index];
	}

	public CharSequence subSequence(int start, int end) {
		byte[] subArray = Arrays.copyOfRange(this.bytes, start, end);
		return new AsciiCharSequence(subArray);
	}

	public String toString() {
		return new String(this.bytes);
	}

}
