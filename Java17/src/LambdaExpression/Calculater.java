package LambdaExpression;

public class Calculater {
public static void main(String[] args) {
	Operation addition=(a,b)->a+b;
	Operation subtraction=(a,b)->a-b;
	Operation multiplication=(a,b)->a*b;
	Operation division=(a,b)->{
		if(b==0) {
			System.out.println("can not br divide!");
			return 0;
		}
		return a/b;
	};
	System.out.println("addition:"+addition.calculater(10, 5));
	System.out.println("subtraction:"+subtraction.calculater(10, 5));
	System.out.println("multiply:"+multiplication.calculater(10, 5));
	System.out.println("division:"+division.calculater(10, 5));
}
}
