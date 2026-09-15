package RGPV;

public class TwoDimensionalArray {
public static void main(String[] args) {
	int[][]arr= {{10,20,30},{40,50,60}};
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println(arr[i][j]+" ");
	
	
	}
	}
	System.out.println();
	System.out.println(arr.length);
	System.out.println(arr);
	System.out.println(arr[0]);
}
}
