package ArrayQuestion;

public class EvenOddNumbers {
public static void main(String[] args) {
	int[]arr= {12,34,45,9,8,90,3};
	System.out.println("even numbers:");
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("even numbers:"+num);
		}
	}
	System.out.println();
	System.out.println("odd numbers:");
	for(int num:arr) {
		if(num%2!=0) {
			System.out.println("odd  numbers:"+num);
		}
	}
}
}
