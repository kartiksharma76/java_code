package starpattern;

public class KartikeySharma {
    public static void main(String[] args) {
        int n = 7; // pattern height

        // ================= FIRST LINE: KARTIKEY SHARMA =================
        for (int i = 0; i < n; i++) {
            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - i - 1 || (j == i && i >= n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1)
                        || (j == n - 1 && i != 0 && i < n / 2) || (i - j == n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - i - 1 || (j == i && i >= n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // Y
            for (int j = 0; j < n; j++) {
                if ((i == j && i < n / 2) || (i + j == n - 1 && i < n / 2) || (j == n / 2 && i >= n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("     "); // spacing between first and last name

            // S
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == n / 2 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1)
                        || (j == n - 1 && i != 0 && i < n / 2) || (i - j == n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println(); // move to next line
        }

        System.out.println(); // space between names

        // ================= SECOND LINE: JAVA DEVELOPER =================
        for (int i = 0; i < n; i++) {
            // J
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2 || (i == n - 1 && j < n / 2) || (j == 0 && i >= n - 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // V
            for (int j = 0; j < n; j++) {
                if ((i == j && i < n / 2) || (i + j == n - 1 && i < n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("     ");

            // D
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (j == n - 1 && i != 0 && i != n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // V
            for (int j = 0; j < n; j++) {
                if ((i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // O
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && j > 0 && j < n - 1 || (j == 0 && i > 0 && i < n - 1)
                        || (j == n - 1 && i > 0 && i < n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // P
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1)
                        || (j == n - 1 && i > 0 && i < n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1)
                        || (j == n - 1 && i < n / 2) || (i - j == n / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
