
/*
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, 
 * разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, 
 * и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
 */
import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		int step = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextInt()) {
				Integer number = sc.nextInt();
				if (step % 2 != 0)
					numbers.add(number);
				step++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Collections.reverse(numbers);

		for (int i = 0; i <= numbers.size(); i++) {
			Integer n = numbers.get(i);
			System.out.print(n + " ");
		}
	}
}
