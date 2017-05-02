/**Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 *Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, 
 *откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), 
 *если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, 
 *т.е. его никто не вызывал.
 */

public class Test {
	
	 private static void anotherMethod() {
	        System.out.println(getCallerClassAndMethodName());
	    }
	 
	 public static String getCallerClassAndMethodName() {
		 StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		 if (stackTraceElements.length <= 3) return null;
		 String meth = stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
	     return meth;
	 }
	
	public static void main(String[] args) {
		System.out.println(getCallerClassAndMethodName());
        anotherMethod();
	}

}
