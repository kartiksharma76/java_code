package strings;

public class RotateString {
public static void main(String[] args) {
	
	String s = "abcde";
	String goal = "cdeab";
	
	if(s.length() != goal.length()) {
		System.out.println(false);
		return;
	}
	
	String doubled  = s + s;
	
	if(doubled.contains(goal)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
}
