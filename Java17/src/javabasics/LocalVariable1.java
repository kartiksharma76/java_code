package javabasics;

public class LocalVariable1 {
	    public void show() {
	        int a = 10;       
	        int b = 20;       
	        int sum = a + b; 
	        System.out.println("Sum = " + sum);
	    }

	    public static void main(String[] args) {
	        LocalVariable1 obj = new LocalVariable1();
	        obj.show();
	    }
	}


