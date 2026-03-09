package ExceptionHandling;

public class ExpH {
	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 5 / x;
			System.out.println(y);
		} catch (Exception e) {
			System.out.println("Exception");
		}
//	catch (ArithmeticException ae) 
//	{
	}
}
