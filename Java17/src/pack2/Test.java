package pack2;

import pack1.pack3.*;//it is not recomended
import pack1.pack3.Dog;
import pack1.pack3.Elephant;
import pack1.pack3.Cat;
//import pack1.Dog;

public class Test {
	public static void main(String[] args) {
		pack1.Student student = new pack1.Student();
		pack1.pack3.Dog dog = new pack1.pack3.Dog();
		Dog dog1 = new Dog();
		pack1.Dog dog2 = new pack1.Dog();
		pack2.Dog dog3 = new pack2.Dog();
		Cat cat = new Cat();
		Elephant elephant = new Elephant();
	}

}
