/*
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.

Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).

С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:

Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"

Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!


 */
public class Pair<T, U> {
	private T ob1;
	private U ob2;

	private Pair() {
		this.ob1 = null;
		this.ob2 = null;
	}

	private Pair(T ob1, U ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	T getFirst() {
		return this.ob1;
	}

	U getSecond() {
		return this.ob2;
	}

	public static <T, U> Pair<T, U> of(T ob1, U ob2) {
		return new Pair<>(ob1, ob2);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;

		Pair<T, U> otherPair = (Pair<T, U>) obj;
		if (ob1 != null ? !ob1.equals(otherPair.getFirst()) : otherPair.getFirst() != null)
			return false;
		return !(ob2 != null ? !ob2.equals(otherPair.getSecond()) : otherPair.getSecond() != null);
	}

	@Override
	public int hashCode() {
		return ob1.hashCode() + ob2.hashCode();
	}

}
