package recursion;

public class Recoursion2 {
	static int count = 0;

	static void printName(String name, int n) {
		count++;
		if (count <= 10) {
			System.out.println(name + count);
			printName(name, count++);
		}
	}

	public static void main(String[] args) {
		printName("kartik", 10);
	}
}