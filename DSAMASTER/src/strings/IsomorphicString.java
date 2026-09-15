package strings;

public class IsomorphicString {

	public static void main(String[] args) {

		String s = "egg";
		String t = "add";

		if (s.length() != t.length()) {
			System.out.println("Not Isomorphic");
			return;
		}

		int[] mapS = new int[256];
		int[] mapT = new int[256];

		for (int i = 0; i < s.length(); i++) {

			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (mapS[ch1] != mapT[ch2]) {
				System.out.println("Not Isomorphic");
				return;
			}

			mapS[ch1] = i + 1;
			mapT[ch2] = i + 1;
		}

		System.out.println("Isomorphic");
	}
}