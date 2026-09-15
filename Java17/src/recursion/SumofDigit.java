package recursion;

public class SumofDigit {
public static int sumofdigit(int n) {
	if(n==0) {
		return 0;
	}
	return n % 10 +sumofdigit(n/10);
}
public static void main(String[] args) {
	System.out.println(sumofdigit(123456));
}
}
