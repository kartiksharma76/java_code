package NPTL25;

import java.util.Scanner;

public class W09_P2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); 

     
        String num1 = "", num2 = "";
        char operator = ' ';
        double result = 0.0;

        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                num1 = input.substring(0, i).trim();
                num2 = input.substring(i + 1).trim();
                break;
            }
        }

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                sc.close();
                return;
        }
       System.out.println(input + " = " + Math.round(result));

        sc.close();
    }
}
