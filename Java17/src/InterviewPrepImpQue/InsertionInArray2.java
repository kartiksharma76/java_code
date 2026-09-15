package InterviewPrepImpQue;

public class InsertionInArray2 {
	public static void main(String[] args) {
		int sizeOfArray = 4;

		int[] arr = new int[sizeOfArray];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int element = 50;

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
