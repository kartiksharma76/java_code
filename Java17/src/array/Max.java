package array;

public class Max {
public static void main(String[] args) {
	int []array= {10,20,50,90,30,60};
	int max=array[0];
	for(int i=1; i<array.length;i++) {
		if(array[i]>max) {
			
		
		max=array[i];
	
	}
	
}
	System.out.println(max);
}
}