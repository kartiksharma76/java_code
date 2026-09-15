package games;

import java.util.*;

public class TowerOfHanoi {
    static Scanner sc = new Scanner(System.in);
    static int totalMoves = 0;

    static List<Integer> pegA = new ArrayList<>();
    static List<Integer> pegB = new ArrayList<>();
    static List<Integer> pegC = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(" TOWER OF HANOI");
        System.out.print("Enter number of disks (3-6 recommended): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        if (n < 1 || n > 8) {
            System.out.println("  1-8 disks only for display.");
            n = Math.max(1, Math.min(8, n));
        }

        initializePegs(n);

        System.out.println("\nChoose Mode:");
        System.out.println("1. Watch AI solve it");
        System.out.println("2. Play manually");
        System.out.print("Enter choice (1 or 2): ");
        int mode = sc.nextInt();
        sc.nextLine();

        System.out.println("\nStart State:");
        printTowers();

        if (mode == 1) {
            totalMoves = 0;
            solveHanoi(n, 'A', 'C', 'B');
            System.out.println("\n Solved in " + totalMoves + " moves!");
        } else if (mode == 2) {
            playManually(n);
        } else {
            System.out.println(" Invalid mode.");
        }

        sc.close();
    }

    static void initializePegs(int n) {
        pegA.clear(); pegB.clear(); pegC.clear();
        for (int i = n; i >= 1; i--) {
            pegA.add(i);
        }
    }

    static void printTowers() {
        int max = Math.max(pegA.size(), Math.max(pegB.size(), pegC.size()));
        System.out.println();

        for (int i = max - 1; i >= 0; i--) {
            String a = i < pegA.size() ? String.valueOf(pegA.get(i)) : "|";
            String b = i < pegB.size() ? String.valueOf(pegB.get(i)) : "|";
            String c = i < pegC.size() ? String.valueOf(pegC.get(i)) : "|";
            System.out.printf("  %-3s    %-3s    %-3s%n", a, b, c);
        }
        System.out.println("─────  ─────  ─────");
        System.out.println("  A      B      C  ");
        System.out.println();
    }

    static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            moveDisk(from, to);
            totalMoves++;
            try { Thread.sleep(800); } catch (InterruptedException e) {}
            printTowers();
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        moveDisk(from, to);
        totalMoves++;
        try { Thread.sleep(800); } catch (InterruptedException e) {}
        printTowers();
        solveHanoi(n - 1, aux, to, from);
    }

    static void moveDisk(char from, char to) {
        List<Integer> fromPeg = getPeg(from);
        List<Integer> toPeg = getPeg(to);

        if (fromPeg.isEmpty()) {
            System.out.println("  No disk on peg " + from);
            return;
        }

        int disk = fromPeg.remove(fromPeg.size() - 1);

        if (!toPeg.isEmpty() && toPeg.get(toPeg.size() - 1) < disk) {
            System.out.println(" Illegal move! Can't put larger disk on smaller.");
            fromPeg.add(disk); // put it back
            return;
        }

        toPeg.add(disk);
        System.out.println("→ Move disk " + disk + " from " + from + " to " + to);
    }

    static List<Integer> getPeg(char peg) {
        return switch (peg) {
            case 'A' -> pegA;
            case 'B' -> pegB;
            case 'C' -> pegC;
            default -> new ArrayList<>();
        };
    }

    static void playManually(int n) {
        totalMoves = 0;
        while (pegC.size() < n) {
            System.out.print("Enter move (e.g., A C to move from A to C): ");
            String input = sc.nextLine().toUpperCase().trim();
            if (input.length() < 3) continue;

            char from = input.charAt(0);
            char to = input.charAt(2);

            if ("ABC".indexOf(from) == -1 || "ABC".indexOf(to) == -1 || from == to) {
                System.out.println(" Invalid pegs. Use A, B, or C.");
                continue;
            }

            moveDisk(from, to);
            totalMoves++;
            printTowers();

            if (pegC.size() == n) {
                System.out.println(" YOU SOLVED IT in " + totalMoves + " moves!");
                break;
            }
        }
    }
}