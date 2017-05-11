
/*Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал NN вычисляется как 1⋅2⋅...⋅N1⋅2⋅...⋅N.
Поскольку это очень быстро растущая функция, то даже для 
небольших NN вместимости типов int и long очень скоро не хватит. 
Поэтому будем использовать BigInteger.*/

import java.math.BigInteger;

public class Factorial {

	public static BigInteger factorial(int value) {
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= value; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
}
