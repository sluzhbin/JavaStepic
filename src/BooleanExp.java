/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно
 * два истинны (любые). Во всех остальных случаях метод должен возвращать false.
 *
 * Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод
 * обеспечивает будет сделан за вас. Вам надо только проанализировать переданные
 * в метод booleanExpression значения (a, b, c, d) и вернуть результат.
 * Попробуйте составить формулу с использованием булевых операторов. Если не
 * получается, вернитесь к этому заданию после просмотра степов про условные
 * операторы и циклы.
 *
 * При записи сложных выражений рекомендуется использовать скобки, чтобы не
 * запутаться в порядке применения операторов.
 *
 * В качестве примера уже указано заведомо некорректное решение задачи.
 * Исправьте его.
 *
 *
 *
 */
public class BooleanExp {
	public static void main(String[] args) {
		System.out.println(booleanExpression(false, false, false, false)); // false
		System.out.println(booleanExpression(true, true, true, true)); // false
		System.out.println(booleanExpression(false, false, true, true)); // true
		System.out.println(booleanExpression(true, true, false, false)); // true
		System.out.println(booleanExpression(true, true, true, false)); // false
	}

	private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
		return ((a ^ b) && (c ^ d)) || ((a && b) && !(c || d)) || (!(a || b) && (c & d));
	}
}
