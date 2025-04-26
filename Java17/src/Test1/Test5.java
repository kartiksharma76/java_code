package Test1;

public class Test5 {
public static void main(String[] args) {
	double a = 1, b = 0, c = 2; // 1
	double mod1 = a % b, mod2 = b % c; // 2
	double result = mod1 > mod2 ? mod1 : mod2; // 3
	System.out.println(result);
}

}
