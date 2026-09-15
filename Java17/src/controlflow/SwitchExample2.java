package controlflow;
/**
 * case must not be duplicate 
 * case must be constant or compile time constant
 * case must be within the range
 */
public class SwitchExample2 {
	public static void main(String[] args) {
		final byte a=20;//compile time constant
		byte b=127;//-128 to +127
		switch(b) {
		case 1:System.out.println("apple");break;
		case 60+60:System.out.println("orange");break;
		case 100:System.out.println("banana");break;
		case a:System.out.println("grapes");break;
		case 127:System.out.println("date");break;
		default:System.out.println("no fruits");
		}
	}

}
