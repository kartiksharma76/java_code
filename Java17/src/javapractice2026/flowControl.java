package javapractice2026;

public class flowControl {

	static int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		int marks = 78;

		// if-else
		if (marks >= 90) {
			System.out.println("Grade A+");
		} else if (marks >= 75) {
			System.out.println("Grade A");
		} else {
			System.out.println("Pass");
		}

		// switch
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Invalid day");
		}

		// for loop + continue + break
		for (int i = 1; i <= 5; i++) {
			if (i == 2)
				continue;
			if (i == 4)
				break;
			System.out.println("For loop: " + i);
		}

		// while loop

		int j = 1;
		while (j <= 3) {
			System.out.println("While loop : " + j);
			j++;
		}

		// do-while loop
		int k = 1;
		do {
			System.out.println("Do-While loop: " + k);
			k++;
		} while (k <= 2);

		// return statement
		int result = add(10, 20);
		System.out.println("Sum = " + result);
	}
}
