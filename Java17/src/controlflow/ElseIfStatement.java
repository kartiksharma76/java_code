package controlflow;

public class ElseIfStatement {
	public static void main(String[] args) {
		int age = 65;
		// teenage 0<teenage>=20
		// young age 20<young age>=60
		// old age greaterthen 60
		if (age > 0 && age <= 20) {
			System.out.println("teen age");
		} else if (age > 20 && age <= 60) {
			System.out.println("young age");
		} else if (age > 60) {
			System.out.println("old age");

		}

	}

}
