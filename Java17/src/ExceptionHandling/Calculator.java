package ExceptionHandling;
/**
 * exception it is an event that disturbs normal flow of the program.
 */
public class Calculator {
public double divide(int a, int b) {
	int c=0;
	try {
		 c=a/b;// riski code
	}
	catch(Exception e) {
		System.out.println("oops something went wrong");
		
		
	}
	System.out.println("kartik");
	return c;
}
}
