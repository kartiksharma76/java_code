package games;

import java.util.*;

public class SnakeGame {
    static final int WIDTH = 20;
    static final int HEIGHT = 10;
    static final char SNAKE_BODY = 'O';
    static final char FOOD = '*';
    static final char EMPTY = ' ';

    static class Position {
        int x, y;
        Position(int x, int y) { this.x = x; this.y = y; }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position p = (Position) o;
            return x == p.x && y == p.y;
        }
    }

    static LinkedList<Position> snake;
    static Position food;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int score = 0;
    static char direction = 'D'; // Start moving right

    public static void main(String[] args) {
        initGame();
        while (true) {
            printBoard();
            System.out.println("Score: " + score);
            System.out.print("Enter WASD (or Q to quit): ");
            String input = sc.nextLine().toUpperCase();
            if (input.isEmpty()) continue;
            char key = input.charAt(0);

            if (key == 'Q') break;
            if ("WASD".indexOf(key) != -1) direction = key;

            if (!moveSnake()) {
                System.out.println("\n💀 GAME OVER! Final Score: " + score);
                break;
            }
        }
        sc.close();
    }

    static void initGame() {
        snake = new LinkedList<>();
        snake.add(new Position(5, 5)); // Start with 1 segment
        placeFood();
    }

    static void printBoard() {
        System.out.println("\n" + "=".repeat(WIDTH * 2));
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                Position current = new Position(x, y);
                if (snake.getFirst().equals(current))
                    System.out.print("■ "); // Head
                else if (snake.contains(current))
                    System.out.print(SNAKE_BODY + " ");
                else if (food != null && food.equals(current))
                    System.out.print(FOOD + " ");
                else
                    System.out.print(EMPTY + " ");
            }
            System.out.println();
        }
        System.out.println("=".repeat(WIDTH * 2));
    }

    static boolean moveSnake() {
        Position head = snake.getFirst();
        int newX = head.x, newY = head.y;

        switch (direction) {
            case 'W' -> newY--;
            case 'S' -> newY++;
            case 'A' -> newX--;
            case 'D' -> newX++;
        }

        if (newX < 0 || newX >= WIDTH || newY < 0 || newY >= HEIGHT) return false;
        Position newHead = new Position(newX, newY);
        if (snake.contains(newHead)) return false; // Hit self

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            score++;
            placeFood();
        } else {
            snake.removeLast();
        }

        return true;
    }

    static void placeFood() {
        while (true) {
            int x = rand.nextInt(WIDTH);
            int y = rand.nextInt(HEIGHT);
            Position pos = new Position(x, y);
            if (!snake.contains(pos)) {
                food = pos;
                break;
            }
        }
    }
}