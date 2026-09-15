package javainterview;

public class Phase5 {
	public static void main(String[] args) {
		// 1. Print 1 to 100, stop at first number divisible by 17
		System.out.println("1. Stop at divisible by 17:");
		for (int i = 1; i <= 100; i++) {
			if (i % 17 == 0) {
				break;
			}
			System.out.print(i + " ");
		}
		// 2. Skip numbers divisible by 5
		System.out.println("\n\n2. Skip divisible by 5:");

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		int[] arr1 = { 10, 0, 20, 30, 0 };
		int sum = 0;
		for (int n : arr1) {
			if (n == 0) {
				continue;
			}
			sum += n;
		}
		System.out.println("\n\n3. Sum (skip 0) = " + sum);

		// 4. Search number and stop
		int[] arr2 = { 5, 10, 15, 20, 25 };
		int target = 15;
		System.out.println("\n4. Searching " + target);
		for (int n : arr2) {
			if (n == target) {
				System.out.println("Found:" + n);
				break;
			}
		}
		// 5. Print until negative appears
		int[] arr3 = { 5, 10, 15, -2, 20 };
		System.out.println("\n5. Print until negative:");
		for (int n : arr3) {
			if (n < 0) {
				break;
			}
			System.out.println(n + " ");
		}
		// 6. Skip odd numbers, print even
		System.out.println("\n\n6. Only even numbers:");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				continue; // odd skip
			}
			System.out.print(i + " ");
		}
		// 7. Add numbers until sum > 100
		int[] arr4 = { 20, 30, 40, 50 };
		int total = 0;
		System.out.println("\n\n7. Stop when sum > 100:");

		for (int n : arr4) {
			total += n;
			if (total > 100) {
				break; // condition meet hote hi stop
			}
			System.out.println("Added: " + n + " Total: " + total);
		}

		System.out.println("Final Sum = " + total);
	}
}
