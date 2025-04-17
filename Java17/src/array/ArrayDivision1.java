package array;

import java.util.Arrays;

public class ArrayDivision1 {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6,7,8,9};
	int mid=arr.length/2;
	int[]arrfirsthalf=Arrays.copyOfRange(arr,0,mid);
	int[]arrsecondhalf=Arrays.copyOfRange(arr, mid,arr.length);
	System.out.println("first half:"+Arrays.toString(arrfirsthalf));
	System.out.println("second half:"+Arrays.toString(arrsecondhalf));
	
}
}
