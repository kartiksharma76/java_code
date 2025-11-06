package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4 73 67 38 33
 * 
 */
public class GradingStudents {
	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<Integer>();
		for (int grade : grades) {
			if (grade < 38) {
				result.add(grade);

			} else {
				int nextMultiple = ((grade / 5) + 1) * 5;
				if (nextMultiple - grade < 3)
					result.add(nextMultiple);
				else
					result.add(grade);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> grades = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			grades.add(sc.nextInt());

			List<Integer> result = gradingStudents(grades);
			for (int r : result) {
				System.out.println(r);
			}
		}
	}
}
