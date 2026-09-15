package TraningAdPlacement;

//if there is non number of decimal value assign input variable for logical operator it will 
//consider as both high inputs then  untill
//unless there is assign value to one of the input variable 
public class LogicalOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println("and operator :" + ((a > b) && (c > a)));
		System.out.println("or operator :" + ((a < b) || (c > a)));
		System.out.println("not operator :" + (!(a > b)));

	}
}
