package ArrayQuestion;

public class TruePalindrome1 {
	public static boolean isPlanidrome(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (right > left) {
			if (arr[left] != arr[right]) {
				return false;
			}
			right--;
			left++;
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		if (isPlanidrome(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
