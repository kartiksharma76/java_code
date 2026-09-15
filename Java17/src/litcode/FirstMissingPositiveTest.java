package litcode;

public class FirstMissingPositiveTest {
	public static void main(String[] args) {
		FirstMissingPositive sol = new FirstMissingPositive();
		int[] nums1 = { 1, 2, 0 };
		int[] nums2 = { 3, 4, -1, 1 };
		int[] nums3 = { 7, 8, 9, 11, 12 };

		System.out.println(sol.firstMissingPositive(nums1));
		System.out.println(sol.firstMissingPositive(nums2));
		System.out.println(sol.firstMissingPositive(nums3));

	}
}
