package InterviewPrepImpQue;

public class InsertionInArray {
	public static void main(String[] args) {
		int sizeOfArray = 6;

		int[] arr = new int[sizeOfArray];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int element = 90;

		insertArEnd(arr, sizeOfArray, element);

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	private static void insertArEnd(int[] arr, int sizeOfArray, int element) {
		// TODO Auto-generated method stub
		arr[sizeOfArray - 1] = element;
	}
}
