package Javaclasses;

public class UsingMultipleClasses {
	/**
	 * you can also create a multiple object of a class and access it is an another
	 * class This is often used for better organization of classes one classes has
	 * all the attributes and method while the other class hold the main() method
	 * 
	 */
	int x = 5;
}

class Second {
	public static void main(String[] args) {
		UsingMultipleClasses myObj = new UsingMultipleClasses();
		System.out.println(myObj.x);
	}
}
