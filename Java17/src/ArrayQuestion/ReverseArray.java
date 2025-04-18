package ArrayQuestion;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7};
	int L=2;
	int R=4;
	ReversesubArray(arr,L,R);
	System.out.println(Arrays.toString(arr));
}

private static void ReversesubArray(int[] arr, int L, int R) {
	L--;
	R--;
	while(L<R) {
		int temp=arr[L];
		arr[L]=arr[R];
		arr[R]=temp;
		L++;
		R--;
	}
}

}
