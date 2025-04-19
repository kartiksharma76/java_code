package ArrayQuestion;

public class MagicNumber {
	public static void main(String[] args) {
		int[] arr = { -2, -1, 2, 4, 6 };
		int magicnumber = findmagicNumber(arr);

		if (magicnumber != -1) {
			System.out.println(magicnumber);
		} else {
			System.out.println("no magic no found");
		}
	}

	private static int findmagicNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				return arr[i];
			}
		}
		return -1;
	}
}
