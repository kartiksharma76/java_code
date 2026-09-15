package RGPV;

import java.util.Arrays;

public class ClosedSumToZero {
public static int[] findclosetsumofzero(int[]arr) {
	Arrays.sort(arr);
	int left=0;
	int right=arr.length-1;
	
	int minvalue=Integer.MAX_VALUE;
	int result[]=new int[2];
	while(left<right) {
		int sum=arr[left]+arr[right];
		if(Math.abs(sum)<Math.abs(minvalue)) {
			minvalue=sum;
			result[0]=arr[left];
			result[1]=arr[right];
		}
		if(sum<0) {
			left++;
		}else {
			right--;
		}
	}
	return result;
	
}
public static void main(String[] args) {
	int []arr= {1, 60, -10, 70, -80, 85};
	int[]closedsumtozero=findclosetsumofzero(arr);
	System.out.println(closedsumtozero[0]+"and"+closedsumtozero[1]);
	
}
}
