package recursion;

public class RecuesionDemo {
	public static void printName(String name,int count) {
		if (count<=0) {
			return;
		}
		System.out.println(name);
		
		printName(name, --count);
	
	}
public static void main(String[] args) {
 printName("jave by kartik",5);
	
	
}
}
