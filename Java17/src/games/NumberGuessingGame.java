package games;

import java.util.*;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(" Welcome to Number Guessing Duel!");
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("\n" + "=".repeat(40));
            System.out.println("Choose Mode:");
            System.out.println("1. You guess AI's number (1-100)");
            System.out.println("2. AI guesses your number (1-100)");
            System.out.print("Enter choice (1 or 2): ");
            int mode = sc.nextInt();
            sc.nextLine(); // consume newline

            if (mode == 1) {
                playUserGuess();
            } else if (mode == 2) {
                playAIGuess();
            } else {
                System.out.println(" X Invalid choice.");
            }

            System.out.print("\nPlay again? (Y/N): ");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }

    static void playUserGuess() {
        int target = rand.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("\nAI has picked a number between 1-100. Can you guess it?");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) System.out.println("🔼 Too low!");
            else if (guess > target) System.out.println("🔽 Too high!");
            else System.out.println("Correct! You got it in " + attempts + " tries!");

        } while (guess != target);
    }

    static void playAIGuess() {
        System.out.println("\nPick a number between 1-100. Don't tell me! Press ENTER when ready.");
        sc.nextLine();

        int low = 1, high = 100;
        int attempts = 0;
        String response;

        System.out.println(" I'll guess your number using logic. Just tell me:");
        System.out.println("  'H' = Higher, 'L' = Lower, 'C' = Correct\n");

        while (low <= high) {
            int mid = (low + high) / 2;
            attempts++;
            System.out.print("Is it " + mid + "? (H/L/C): ");
            response = sc.nextLine().toUpperCase();

            if (response.equals("C")) {
                System.out.println(" AI wins! Guessed in " + attempts + " tries.");
                return;
            } else if (response.equals("H")) {
                low = mid + 1;
            } else if (response.equals("L")) {
                high = mid - 1;
            } else {
                System.out.println(" Please enter H, L, or C.");
                attempts--; // don't count invalid input
            }
        }

        System.out.println(" Something went wrong... Did you change your number?");
    }
}