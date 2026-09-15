package array;

public class ReverseArray1 {
public static void Reversearray(int[]arr) {
	int n=arr.length;
	for(int i=0;i<n/2; i++) {
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr [n-i-1]=temp;
	}
	if(n==1) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
public static void main(String[] args) {
	int []arr= {1,2,3,4,3,2,1};
	Reversearray(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
