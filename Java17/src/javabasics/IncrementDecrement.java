package javabasics;
/**
 * Start from a = 3
 * a++ = 3 (postinrement) = 4
 * ++a = 5 (pre increment) = 5
 * the output is =  a++ +" "+  ++a = 3 +" "+ 5 = 35 is correct answer
 */
public class IncrementDecrement {
public static void main(String[] args) {
	int a = 3;
	System.out.println(a++  +" "+   ++a);
}
}
