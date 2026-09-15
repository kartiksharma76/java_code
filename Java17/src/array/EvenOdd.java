package array;

public class EvenOdd {
	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
		int even = arr[0];
		for (int i=1;i<arr.length;i++) {
			

			if (arr[i] > even)

			{
			
				 even= arr[i];         

			}
		}
		System.out.println("even Element is array is:" + even);

		int[] arr1 = {  1,2,3,4,5,6,7,8,9,10};
		int odd = arr1[0];

		for (int i = 1; i < arr1.length; i++) {

			if (arr1[i] < odd) {

				odd = arr1[i];
			}

		}

		System.out.println("odd Element is Array is:" + odd);
	}

}


