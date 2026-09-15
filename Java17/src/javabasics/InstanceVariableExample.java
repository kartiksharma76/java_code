package javabasics;

import java.util.Scanner;

public class InstanceVariableExample {
  
    int a;  
    int b;

    public InstanceVariableExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void displaySum() {
        System.out.println("Sum = " + (a + b));
    }

    public void displaySub() {
        System.out.println("Subtraction = " + (a - b));
    }

    public void displayMul() {
        System.out.println("Multiplication = " + (a * b));
    }

    public void displayDiv() {
        if (b != 0) {
            System.out.println("Division = " + ((double) a / b));  
        } else {
            System.out.println("Division = Undefined (division by zero)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int first = sc.nextInt();

        System.out.print("Enter second value: ");
        int second = sc.nextInt();

        InstanceVariableExample obj = new InstanceVariableExample(first, second);

        obj.displaySum(); 
        obj.displaySub();
        obj.displayMul();
        obj.displayDiv();

        sc.close();
    }
}
