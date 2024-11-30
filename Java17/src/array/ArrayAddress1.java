package array;

public class ArrayAddress1 {
	public static void main(String[] args) {
		int baseAddress = 100;
		int elementSize = 4;
		int Row = 8;
		int Column = 10;

		int i = 4;
		int j = 12;
		int lowerRowLimit = 2;
		int lowerColumnLimit = 9;

		int Address = baseAddress + (j - lowerColumnLimit) + Row + (i - lowerRowLimit) + elementSize;
		System.out.println("Address of Z1(4,12) is:" + Address);
	}
}
