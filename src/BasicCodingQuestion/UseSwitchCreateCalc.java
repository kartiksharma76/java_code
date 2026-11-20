package BasicCodingQuestion;

import java.util.Scanner;

public class UseSwitchCreateCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();

        switch (op){
            case '+':System.out.println(a + b);break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if(b != 0) {
                    System.out.println(a /b);
                }else{
                    System.out.println("Does Not Divide by Zero");
                    break;
                }
//            default:
            //    System.out.println("Wrong Operator");
        }
    }
}
