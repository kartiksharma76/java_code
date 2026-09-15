package ExceptionHandling;

public class Test {
public static void main(String[] args) {
	Calculator calculator=new Calculator();
	double divide = calculator.divide(10, 0);
	System.out.println(divide);
	System.out.println("prince");
}
}
