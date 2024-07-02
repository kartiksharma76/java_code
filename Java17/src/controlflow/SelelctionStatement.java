package controlflow;

//if else switch.
public class SelelctionStatement {
	public static void main(String[] args) {
		int age = 17;
		if (age >= 18) {
			System.out.println("you can cast vote");
		} else {
			System.out.println("you cant cast vote");
		}
		System.out.println("other syntax");
		if (age >= 18)
			System.out.println("you can cast vote");

		else
			System.out.println("you cant cast vote");

	}

}
