package javabasics;

public class Elephant {
	public int legs = 4;
	public int ear = 2;
	public int weight = 6000;
	public String colour = "grayish to broun";
	public String tail = "long";
	public String nose = "long";

	public static void main(String[] argu) {
		Elephant elephant = new Elephant();
		int legs = elephant.legs;
		System.out.println(legs);
//System.out.println(elephant.name);
		int ear = elephant.ear;
		System.out.println(ear);
		int weight = elephant.weight;
		System.out.println(weight);
		String colour = elephant.colour;
		System.out.println(colour);
		String tail = elephant.tail;
		System.out.println(tail);
		String nose = elephant.nose;
		System.out.println(nose);

	}
}
