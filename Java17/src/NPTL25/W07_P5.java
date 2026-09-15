package NPTL25;

import java.util.Scanner;

public class W07_P5 {
	private String password;

    // Step 1: Constructor to initialize the password variable
    public W07_P5(String password) {
        this.password = password; 
    }

    // Method to validate password
    public boolean isValidPassword(String password) {
        // Step 1: Check length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        // Step 2: Loop through each character
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Return true only if all conditions are met
        return hasUpperCase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read password input from user
        String inputPassword = scanner.nextLine();
        scanner.close();

        W07_P5 validator = new W07_P5(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }
    }
}
