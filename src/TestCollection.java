/*
 * Предположим, у нас есть две переменных:

Collection<?> collection = ...;
Object object = ...;

Какие операции над collection допустимы?
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection<?> collection = new ArrayList<>();
		Object o = new Object();
		collection.contains(o);
		collection.toArray();
		collection.add(o);//Error
		collection.remove(o);
		collection.size();
		collection.iterator();
		collection.addAll(Arrays.asList(o));//Error
		collection.clear();
	}

}
