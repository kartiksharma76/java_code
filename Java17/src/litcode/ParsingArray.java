package litcode;

public class ParsingArray {
	public static void main(String[] args) {

		String str = "10,20,30,40,50";
		String[] parts = str.split(",");
		int[] arr = new int[parts.length];

		for (int i = 0; i < parts.length; i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}
		for (int x : arr) {
			System.out.println(x);
		}
	}
}
