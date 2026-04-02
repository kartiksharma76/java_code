package InterviewPrepImpQue;

public class Swaping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		System.out.println(a + b);
		System.out.println("before swapping:" + a + b);
//		int t = a;
//		a = b;
//		b = t;
		
		
		
		//logic 2
//		a = a+b;
//		b = a-b;
//		a= a-b;
//		System.out.println("after swapping:" + a + b);

		
        // logic 3
//		a= a*b;
//		b= a/b;
//		a= a/b;
//		System.out.println("after swapping:" + a + b);
	
		
		//logic 4
//		a = a^b;
//		b = a^b;
//		a = a^b;
//		System.out.println("after swapping:" + a + b);
		
		
		
        //logic 5
		b = a+b-(a=b);
		System.out.println("after swapping:" + a + b);
	}
}
