package javabasics;

public class Cat {
	public static int leg = 4;
	public static String voice = "mews";
	public static int weight = 2;
	public static String food = "non vagiterion";

	public static void main(String[] args) {
		Cat cat = new Cat();
		int leg = Cat.leg;
		System.out.println(leg);
		String voice = Cat.voice;
		System.out.println(voice);
		int weight = Cat.weight;
		System.out.println(weight);
		String food = Cat.food;
		System.out.println(food);
	}
}
