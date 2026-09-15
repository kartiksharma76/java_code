package games;

import java.util.*;

public class MazeRunner {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static char[][] maze = {
        "#########".toCharArray(),
        "# #     #".toCharArray(),
        "# # ### #".toCharArray(),
        "# #   # #".toCharArray(),
        "# ### # #".toCharArray(),
        "#     # #".toCharArray(),
        "####### #".toCharArray(),
        "#       #".toCharArray(),
        "#########".toCharArray()
    };

    static int playerX = 1, playerY = 1;
    static int exitX = 7, exitY = 7;

    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        System.out.println(" MAZE RUNNER");
        System.out.println("1. Play Yourself (WASD to move)");
        System.out.println("2. Watch AI Solve (BFS Pathfinding)");
        System.out.print("Choose mode (1 or 2): ");
        int mode = sc.nextInt();
        sc.nextLine();

        printMaze();

        if (mode == 1) {
            play();
        } else if (mode == 2) {
            solveWithBFS();
        } else {
            System.out.println("❌ Invalid mode.");
        }

        sc.close();
    }

    static void printMaze() {
        System.out.println();
        for (int y = 0; y < maze.length; y++) {
            for (int x = 0; x < maze[y].length; x++) {
                if (x == playerX && y == playerY) {
                    System.out.print("@");
                } else {
                    System.out.print(maze[y][x]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void play() {
        System.out.println("  Use W/A/S/D to move. Reach 'E' to win!");

        while (true) {
            System.out.print("Move (W/A/S/D/Q to quit): ");
            String input = sc.nextLine().toUpperCase();
            if (input.isEmpty()) continue;
            char key = input.charAt(0);

            int newX = playerX, newY = playerY;

            switch (key) {
                case 'W' -> newY--;
                case 'S' -> newY++;
                case 'A' -> newX--;
                case 'D' -> newX++;
                case 'Q' -> {
                    System.out.println(" Quitting...");
                    return;
                }
                default -> {
                    System.out.println("Use W/A/S/D");
                    continue;
                }
            }

            if (newX < 0 || newX >= maze[0].length || newY < 0 || newY >= maze.length) {
                System.out.println(" X Can't move there!");
                continue;
            }

            if (maze[newY][newX] == '#') {
                System.out.println(" Hit a wall!");
                continue;
            }

            playerX = newX;
            playerY = newY;

            printMaze();

            if (playerX == exitX && playerY == exitY) {
                System.out.println(" YOU ESCAPED THE MAZE!");
                break;
            }
        }
    }

    static void solveWithBFS() {
        System.out.println(" AI is solving the maze using BFS...");

        Queue<Point> q = new LinkedList<>();
        Map<Point, Point> parent = new HashMap<>();
        Set<Point> visited = new HashSet<>();

        Point start = new Point(playerX, playerY);
        q.add(start);
        visited.add(start);

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        Point end = new Point(exitX, exitY);
        Point found = null;

        while (!q.isEmpty()) {
            Point current = q.poll();

            if (current.equals(end)) {
                found = current;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || nx >= maze[0].length || ny < 0 || ny >= maze.length) continue;
                if (maze[ny][nx] == '#') continue;

                Point next = new Point(nx, ny);
                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, current);
                    q.add(next);
                }
            }
        }

        if (found == null) {
            System.out.println(" No path found!");
            return;
        }

        // Reconstruct path
        List<Point> path = new ArrayList<>();
        Point current = found;
        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }
        Collections.reverse(path);

        // Animate path
        for (Point p : path) {
            if (!p.equals(start) && !p.equals(end)) {
                maze[p.y][p.x] = '*';
            }
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            clearScreen();
            printMaze();
        }

        System.out.println(" AI found the exit in " + (path.size() - 1) + " steps!");
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}