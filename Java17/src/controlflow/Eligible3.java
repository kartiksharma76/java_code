package controlflow;

public class Eligible3 {
	public static boolean iseligible(int mat, int inter, int grad) {
		if (mat >= 60) {
			if (inter >= 60) {
				if (grad >= 60) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;

			}

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int mat = 60;
		int inter = 75;
		int grad = 80;

		boolean result = iseligible(mat, inter, grad);
		System.out.println(result);
	}
}
