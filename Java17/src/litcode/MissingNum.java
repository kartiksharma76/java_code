package litcode;

public class MissingNum {
	public int missingNum(int[] nums) {
		int n = nums.length;
		int expected = n * (n + 1) / 2;
		int actual = 0;
		for (int num : nums) {
			actual += num;
		}
		return expected - actual;
	}

	public static void main(String[] args) {
		MissingElement element = new MissingElement();
		int[] arr = { 3, 0, 1 };
		int result = element.missingNum(arr);
		System.out.println("Missing Number: " + result);
	}
}
