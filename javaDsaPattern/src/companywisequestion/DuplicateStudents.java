package companywisequestion;

//Question:
//Student database me duplicate records detect karne hain.

import java.util.HashSet;

public class DuplicateStudents {

	public static void main(String[] args) {

		int[] ids = { 101, 102, 103, 101, 104 };

		HashSet<Integer> set = new HashSet<>();

		boolean duplicate = false;

		for (int id : ids) {

			if (!set.add(id)) {

				duplicate = true;
				System.out.println("Duplicate Found: " + id);
			}
		}

		if (!duplicate) {
			System.out.println("No Duplicate Found");
		}
	}
}