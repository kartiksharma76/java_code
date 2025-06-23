package HackerRank;

import java.util.Scanner;
class UsernameValidator {
  /**
  8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
   */
   public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class ValidUserName {
private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
