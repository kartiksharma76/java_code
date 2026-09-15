package javabasics;

public class SwappingBItwise {
public static void main(String[] args) {
	int a = 5;
	int b = 10;
	 System.out.println("beforeswap: a="+a+ ",b="+b);
	a=a^b;
	b=a^b;
	a=a^b;
	 System.out.println("afterswap: a="+a+ ",b="+b);
}
}
