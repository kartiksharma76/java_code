package javabasics;

public class Elephant {
	public static int legs = 4;
	public static  int ear = 2;
	public int weight = 6000;
	public  String colour = "grayish to broun";
	public static int  tail = 1;
	public static  int nose = 1;

	public static void main(String[] argu) {
		Elephant elephant = new Elephant();
		int legs = Elephant.legs;
		System.out.println(legs);
//System.out.println(elephant.name);
		
		int ear = Elephant.ear;
		System.out.println(ear);
		int weight = elephant.weight;
		System.out.println(weight);
		String colour = elephant.colour;
		System.out.println(colour);
		int  tail = Elephant.tail;
		System.out.println(tail);
		int  nose = Elephant.nose;
		System.out.println(nose);

	}
}
