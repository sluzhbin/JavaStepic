/*Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 * Палиндромом называется строка, 
 * которая читается одинаково слева направо и справа налево (в том числе пустая). 
 * При определении "палиндромности" строки должны учитываться только буквы и цифры. 
 * А пробелы, знаки препинания, а также регистр символов должны игнорироваться. 
 * Гарантируется, что в метод попадают только строки, 
 * состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
 * Т.е. русских, китайских и прочих экзотических символов в строке не будет.
 */
public class Palindrome {

	public static boolean isPalindrome(String text) {
		String s1 = text.replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.reverse();
		String s2 = sb.toString();
		boolean contentIgnoreCase = s2.equalsIgnoreCase(s1);
		return contentIgnoreCase;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Madam, I'm Adam!"));
	}

}
