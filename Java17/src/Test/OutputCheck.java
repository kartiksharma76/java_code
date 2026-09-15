package Test;

public class OutputCheck {
static int x=10;
static int y=20;
public static void main(String[] args) {
	System.out.println(x+y);
	System.out.println(x+get(30));
}
public static int get(int x) {
	return x+y;
}
}
//out put is 3060