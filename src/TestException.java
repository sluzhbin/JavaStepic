/**Реализуйте метод sqrt(), вычисляющий квадратный корень числа. 
 * В отличие от Math.sqrt(), это метод при передаче отрицательного параметра должен бросать исключение 
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.
*/

public class TestException {
	double x;
	
	TestException(double x){
		this.x = x;
	}
	
	public static double sqrt(double x) throws IllegalArgumentException {
		if(x >= 0) return Math.sqrt(x);
		else throw new IllegalArgumentException("Expected non-negative number, got " + x);
		
	}

	public static void main(String[] args) {
		System.out.println(sqrt(-4));
	}

}
