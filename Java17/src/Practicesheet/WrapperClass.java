package Practicesheet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
//Wrapper classes provide a way to use primitive data types (int, boolean, etc.) as objects.
	//They "wrap" primitive values in objects.
	
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		//utility method
		String binary = Integer.toBinaryString(10);
		String hex = Integer.toHexString(225);
		
        // 3. Type conversion
		int value = Integer.parseInt("100");
		double doubleValue = Double.parseDouble("3.14"); 
		
		char ch = 'A';
        System.out.println(Character.isUpperCase(ch));  // true
        System.out.println(Character.toLowerCase(ch));  // 'a'
        
        // 5. Boolean parsing (lenient)
        System.out.println(Boolean.parseBoolean("TRUE"));  // true
        System.out.println(Boolean.parseBoolean("yes"));   // false
	}
}
