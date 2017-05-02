/*
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в 
 * тексте вещественных чисел с точностью до шестого знака после запятой.
 * Числом считается последовательность символов, отделенная от окружающего текста пробелами или 
 * переводами строк и успешно разбираемая методом Double.parseDouble.
 */
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double d = 0.0;
        while(sc.hasNextDouble()){
            try{
                d += Double.parseDouble(sc.next());
            }
            catch (NumberFormatException e){};
        }
        System.out.format("%.6f", d);
    }
	}


