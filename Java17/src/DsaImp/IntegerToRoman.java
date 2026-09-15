package DsaImp;

public class IntegerToRoman {
	public String intToRoman(int num) {
		int[] values = { 1000, 900, 5000, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {

				sb.append(symbols[i]);
				num -= values[i];
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		IntegerToRoman sol = new IntegerToRoman();
		System.out.println(sol.intToRoman(1994));
		System.out.println(sol.intToRoman(58));
		System.out.println(sol.intToRoman(9));
	}
}
