package javabasics;
/**
 *  Option A is correct. The >>> operator moves all bits to the right, zero filling the left bits.
 *  The bit transformation looks like this: 
 *  Before: 1000 0000 0000 0000 0000 0000 0000 0000 
 *  After: 0000 0000 0000 0000 0000 0000 0000 0001
 */
public class BitShift {
public static void main(String[] args) {
	int x = 0x80000000;
	System.out.print(x + " and  ");
	x = x >>> 31;
	System.out.println(x);
}
}
