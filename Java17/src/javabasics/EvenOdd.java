package javabasics;

public class EvenOdd {
public static void main(String[] args) {
	System.out.println("print first ten even number are");
	
	first10Even();

}

static void first10Even() {
	
		
	
	int a=0;
	int b=0;
	while(a<10) {
		
		if (b %2==0) {
			 a++;
			 System.out.println(b +" ");
			 
		}
	b++;
	}
	
}
}