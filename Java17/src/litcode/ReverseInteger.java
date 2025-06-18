package litcode;

public class ReverseInteger {
public static void main(String[] args) {
	int x=123;
	System.out.println(Reversednumber(x));
	
}

public static int Reversednumber(int x) {
	int reverse=0;
	while(x>0) {
		int remainder=x%10;
		reverse=reverse*10+remainder;
		x=x/10;
	}
	return reverse;
}
}
