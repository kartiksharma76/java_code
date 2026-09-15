package ArrayQuestion;

import java.util.Arrays;

public class ReverseArray1 {
public static void main(String[] args) {
	int []arr= {1,6,7,4};
	int L=1;
	int R=4;
	RevereseSubArray(arr,L,R);
	System.out.println(Arrays.toString(arr));
}

private static void RevereseSubArray(int[] arr, int L, int R) {
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
