package array;

public class R {
public void R(int []arr,int d,int n) {
	int temp[]=new int[d];
	for(int i=0; i<d;i++) {
	 temp[i]=arr[i];
	}
	for(int i=d; i<n;i++) {
		arr[i-d]=arr[i];
	}
	for(int i=0;i<d;i++) {
		arr[i+n-d]=temp[i];
		
	}
}
public void print(int[]arr,int n) {
	for(int i=0; i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static void main(String[] args) {
	R r=new R();
	int arr[]= {20,30,40,50,60,70,80,90};
	r.R(arr, 5, arr.length);
	r.print(arr, arr.length);
}
}
