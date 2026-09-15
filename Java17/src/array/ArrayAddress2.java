package array;

public class ArrayAddress2 {
	public static void main(String[] args) {
		int rows = 20;
		int columns = 5;

		int baseAddress = 840;
		int cellsize = 8;

		int row = 15;
		int column = 3;

		int rowmajorAddress = baseAddress + (row * columns + column) * cellsize;
		int columnmjorAddress = baseAddress + (column * rows + row) * cellsize;

		System.out.println("row major address A[15,3]:" + rowmajorAddress);
		System.out.println("column major address A[15,3]:" + columnmjorAddress);
	}
}
