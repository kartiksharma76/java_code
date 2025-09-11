package games;
import java.util.*;
public class BattleShip {
	static final int SIZE = 10;
    static final char EMPTY = '~';
    static final char HIT = 'X';
    static final char MISS = 'O';
    static final char SHIP = 'S';

    static char[][] playerBoard = new char[SIZE][SIZE];
    static char[][] aiBoard = new char[SIZE][SIZE];
    static char[][] playerTargetBoard = new char[SIZE][SIZE]; // for tracking shots

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static class Ship {
        int size;
        String name;
        Ship(int size, String name) { this.size = size; this.name = name; }
    }

    static List<Ship> ships = Arrays.asList(
        new Ship(5, "Carrier"),
        new Ship(4, "Battleship"),
        new Ship(3, "Cruiser"),
        new Ship(3, "Submarine"),
        new Ship(2, "Destroyer")
    );

    public static void main(String[] args) {
        initializeBoards();
        System.out.println("WELCOME TO BATTLESHIP!");

        placePlayerShips();
        placeAIShips();

        System.out.println("\nGame Start! You vs AI");
        playGame();
    }

    static void initializeBoards() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(playerBoard[i], EMPTY);
            Arrays.fill(aiBoard[i], EMPTY);
            Arrays.fill(playerTargetBoard[i], EMPTY);
        }
    }

    static void printBoard(char[][] board, boolean hideShips) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) System.out.print(i + " ");
        System.out.println();
        for (int y = 0; y < SIZE; y++) {
            System.out.print((char)('A' + y) + " ");
            for (int x = 0; x < SIZE; x++) {
                char c = board[y][x];
                if (hideShips && c == SHIP) c = EMPTY;
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void placePlayerShips() {
        System.out.println(" Place your ships:");
        for (Ship ship : ships) {
            boolean placed = false;
            while (!placed) {
                printBoard(playerBoard, false);
                System.out.println("Place " + ship.name + " (size " + ship.size + ")");
                System.out.print("Enter position (e.g., A5) and direction (H/V): ");
                String input = sc.nextLine().toUpperCase().trim();
                if (input.length() < 3) continue;

                char rowChar = input.charAt(0);
                int col = input.charAt(1) - '0';
                char dir = input.charAt(2);

                int row = rowChar - 'A';

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("X Invalid position.");
                    continue;
                }

                if (dir != 'H' && dir != 'V') {
                    System.out.println("X se H or V for direction.");
                    continue;
                }

                if (canPlaceShip(playerBoard, row, col, ship.size, dir)) {
                    placeShip(playerBoard, row, col, ship.size, dir);
                    placed = true;
                } else {
                    System.out.println("X Can't place ship there.");
                }
            }
        }
    }

    static void placeAIShips() {
        for (Ship ship : ships) {
            boolean placed = false;
            while (!placed) {
                int row = rand.nextInt(SIZE);
                int col = rand.nextInt(SIZE);
                char dir = rand.nextBoolean() ? 'H' : 'V';
                if (canPlaceShip(aiBoard, row, col, ship.size, dir)) {
                    placeShip(aiBoard, row, col, ship.size, dir);
                    placed = true;
                }
            }
        }
    }

    static boolean canPlaceShip(char[][] board, int row, int col, int size, char dir) {
        if (dir == 'H') {
            if (col + size > SIZE) return false;
            for (int i = 0; i < size; i++) {
                if (board[row][col + i] != EMPTY) return false;
            }
        } else {
            if (row + size > SIZE) return false;
            for (int i = 0; i < size; i++) {
                if (board[row + i][col] != EMPTY) return false;
            }
        }
        return true;
    }

    static void placeShip(char[][] board, int row, int col, int size, char dir) {
        if (dir == 'H') {
            for (int i = 0; i < size; i++) board[row][col + i] = SHIP;
        } else {
            for (int i = 0; i < size; i++) board[row + i][col] = SHIP;
        }
    }

    static void playGame() {
        boolean playerTurn = true;

        while (true) {
            if (playerTurn) {
                System.out.println(" YOUR TURN — Shoot at AI");
                printBoard(playerTargetBoard, false);
                System.out.print("Enter target (e.g., B3): ");
                String input = sc.nextLine().toUpperCase().trim();
                if (input.length() < 2) continue;

                int row = input.charAt(0) - 'A';
                int col = input.charAt(1) - '0';

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("X Invalid target.");
                    continue;
                }

                if (playerTargetBoard[row][col] != EMPTY) {
                    System.out.println("X Already fired there.");
                    continue;
                }

                if (aiBoard[row][col] == SHIP) {
                    playerTargetBoard[row][col] = HIT;
                    aiBoard[row][col] = HIT;
                    System.out.println(" HIT!");
                    if (allShipsSunk(aiBoard)) {
                        System.out.println("🎉 YOU WIN! All enemy ships sunk!");
                        return;
                    }
                } else {
                    playerTargetBoard[row][col] = MISS;
                    System.out.println(" MISS!");
                }

            } else {
                System.out.println(" AI's Turn...");
                int row, col;
                do {
                    row = rand.nextInt(SIZE);
                    col = rand.nextInt(SIZE);
                } while (playerBoard[row][col] == HIT || playerBoard[row][col] == MISS);

                System.out.println("AI fires at " + (char)('A' + row) + col);

                if (playerBoard[row][col] == SHIP) {
                    playerBoard[row][col] = HIT;
                    System.out.println(" AI HIT your ship!");
                    if (allShipsSunk(playerBoard)) {
                        System.out.println(" AI WINS! All your ships sunk!");
                        return;
                    }
                } else {
                    playerBoard[row][col] = MISS;
                    System.out.println(" AI missed!");
                }
            }

            playerTurn = !playerTurn;
            System.out.println("\n" + "=".repeat(30) + "\n");
        }
    }

    static boolean allShipsSunk(char[][] board) {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (board[y][x] == SHIP) return false;
            }
        }
        return true;
    }

}
