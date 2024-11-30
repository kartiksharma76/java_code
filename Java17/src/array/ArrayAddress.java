package array;

public class ArrayAddress {
	public static void main(String[] args) {
		int baseAddress = 100;
		int elementSize = 4;
		int rows = 8;
		int columns = 8;

		int i = 1;
		int j = 7;
		int lowerRowLimit = 1;
		int lowerColumnLimit = 7;
		int Address = baseAddress + (i - lowerRowLimit) + columns + (j - lowerColumnLimit) + elementSize;
		System.out.println("Address of A1(4,12)is:" + Address);
	}
}
