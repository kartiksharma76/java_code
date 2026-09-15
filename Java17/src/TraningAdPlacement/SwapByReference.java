package TraningAdPlacement;

public class SwapByReference {
	static void swapRef(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20 };
		swapRef(nums);
		System.out.println("x=" + nums[0] + ", y=" + nums[1]); // swapped!
	}
}