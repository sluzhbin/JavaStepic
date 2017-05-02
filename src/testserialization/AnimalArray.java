package testserialization;
/*Дан сериализуемый класс Animal:
 * 
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. 
Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи 
ObjectOutputStream.writeInt(size).
 Далее подряд записано указанное количество объектов типа Animal, 
 сериализованных при помощи ObjectOutputStream.writeObject(animal).

Если вдруг массив байт не является корректным представлением массива экземпляров Animal, 
то метод должен бросить исключение java.lang.IllegalArgumentException.

Причины некорректности могут быть разные. Попробуйте подать на вход методу разные 
некорректные данные и посмотрите, какие исключения будут возникать. 
Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.
 * 
 */
import java.io.*;

public class AnimalArray {

		public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException{
			Animal[] animals = null;
			int len;
			ObjectInputStream in = null;
			try{
				in = new ObjectInputStream(new ByteArrayInputStream(data));
				len = in.readInt();
				animals = new Animal[len];
				for(int i = 0; i < len; i++){
					animals[i] = (Animal) in.readObject();
				}
				in.close();
			} catch(Exception e){
				throw new IllegalArgumentException();
			}
			return animals;
		}
		

	}

