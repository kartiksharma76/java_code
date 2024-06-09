package operaters;

/**
 * if numinetor and dunimenetor both are integral values and dunimenetor is 0
 * then JVM will throw ArithematicException. if numinetor or dunimenetor is of
 * floating type(other then 0.0) and duneminetor is (0 or 0.0) then the result
 * will be infinity. if numinetor or dunimenetor is 0.0 and dunimenetor is 0 or
 * 0.0 then the result will be NaN(not a number).
 * 
 */
public class ArthematicOperaterDemo {
	public static void main(String[] args) {
		System.out.println(10.0 / 0);
		System.out.println(10 / 0.0);
		System.out.println(10.0 / 0.0);

		System.out.println(-10.0 / 0);
		System.out.println(-10 / 0.0);
		System.out.println(-10.0 / 0.0);
		System.out.println(0.0 / 0);
		System.out.println(0 / 0.0);
		System.out.println(0.0 / 0.0);
		System.out.println(10 + 0.0 / 0);
	}
}
