package javabasics;

public class GFG {
	public static int ctr = 0;

	public GFG() {
		ctr++;
	}

	public static void main(String[] args) {
		GFG obj1 = new GFG();
		GFG obj2 = new GFG();
		GFG obj = new GFG();
		System.out.println("Number objet are Created :" + obj1.ctr);
	}
}
