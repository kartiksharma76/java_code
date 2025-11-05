package litcode;

public class MagicNoFound {
	public static void main(String[] args) {
		int[] arr = { -1, 1, 2, 3, 4, 5, 7 };
		int magicNo = findMagicNumber(arr);
		if (magicNo != -1) {
			System.out.println(magicNo);

		} else {
			System.out.println("No magic Found");
		}
	}

	private static int findMagicNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				return arr[i];
			}
		}
		return -1;
	}
}
