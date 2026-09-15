package array;

public class InsertingElement {
static void inserting(int arr []) {
	
	int n= arr.length;
	for(int i=0; i<n;i++) {
		int a= arr[i];
		int j=(i-1);
		
		while(j>=0&& arr[j]>a) {
			arr[j+1]=arr[j];
			j=(j-1);
			
		}
		arr[j+1]=a;
		
	}
	
}
static void printarray(int arr[]) {
	int n=arr.length;
	for(int i=0; i<n;++i) {
		System.out.print(arr[i]+", ");
		
	}
	
}
public static void main(String[] args) {
	int []arr= {1,4,2,4,6,78,33,245,67543,245667};
	InsertingElement insertingelement=new InsertingElement();
	inserting(arr);
     printarray(arr); 
}
}
