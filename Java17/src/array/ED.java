package array;

public class ED {
public static void main(String[] args) {
	int arr[]= {2,4,3,8,10};
	System.out.println("odd number");
   for(int i=0;i<arr.length;i++) {
	   if(arr[i]%2!=0) {
		   System.out.println(arr[i]+" ");
	   }
	     
   }
   System.out.println("even number");
   for(int i=0;i<arr.length;i++) {
	   if(arr[i]%2==0) {
		   System.out.println(arr[i]);
		   
	   }
   }
}
}
