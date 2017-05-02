/*
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */
import java.util.*;

public class TestSet {
	public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>(set1.size());
        set3.addAll(set1);
        
        Set<T> set4 = new HashSet<>(set2.size());
        set4.addAll(set2);
        
        set3.removeAll(set2);
        set4.removeAll(set1);
        Set<T> resultSet = new HashSet<>();  
        resultSet.addAll(set3);
        resultSet.addAll(set4);
        return resultSet;
	}
}
