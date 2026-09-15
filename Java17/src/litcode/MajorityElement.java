package litcode;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		int count = 0;
		int candidate = 0;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate)
				count++;
			else
				count--;
		}
		return candidate;
	}

	public static void main(String[] args) {
		MajorityElement element = new MajorityElement();
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		int result = element.majorityElement(arr);
		System.out.println("Majority Element: " + result);
	}
}