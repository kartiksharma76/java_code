package games;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class SofaProblem {
	static class State {
		int r;
		int c;
		int orientation;
		int steps;

		public State(int r, int c, int orientation, int steps) {
			this.r = r;
			this.c = c;
			this.orientation = orientation;
			this.steps = steps;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			State state = (State) o;
			return r == state.r && c == state.c && orientation == state.orientation;
		}

		@Override
		public int hashCode() {
			return Objects.hash(r, c, orientation);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();

		char[][] grid = new char[M][N];
		List<int[]> sPos = new ArrayList<>();
		List<int[]> SPos = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			String line = sc.nextLine().trim();
			String[] parts = line.split(" ");
			for (int j = 0; j < N; j++) {
				grid[i][j] = parts[j].charAt(0);
				if (grid[i][j] == 's') {
					sPos.add(new int[] { i, j });
				} else if (grid[i][j] == 'S') {
					SPos.add(new int[] { i, j });
				}
			}
		}

		if (sPos.size() != 2) {
			System.out.println("Impossible");
			return;
		}

		int[] p1 = sPos.get(0), p2 = sPos.get(1);
		int r1 = p1[0], c1 = p1[1], r2 = p2[0], c2 = p2[1];

		int refR, refC, orientation;

		if (r1 == r2) {
			orientation = 0;
			refR = r1;
			refC = Math.min(c1, c2);
		} else if (c1 == c2) {
			orientation = 1;
			refR = Math.min(r1, r2);
			refC = c1;
		} else {
			System.out.println("Impossible");
			return;
		}

		if (SPos.size() != 2) {
			System.out.println("Impossible");
			return;
		}

		int[] s1 = SPos.get(0), s2 = SPos.get(1);
		int sr1 = s1[0], sc1 = s1[1], sr2 = s2[0], sc2 = s2[1];
		boolean validDest = (sr1 == sr2 && Math.abs(sc1 - sc2) == 1) || (sc1 == sc2 && Math.abs(sr1 - sr2) == 1);
		if (!validDest) {
			System.out.println("Impossible");
			return;
		}

		Set<State> visited = new HashSet<>();
		Queue<State> q = new LinkedList<>();

		State start = new State(refR, refC, orientation, 0);
		visited.add(start);
		q.offer(start);

		int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		while (!q.isEmpty()) {
			State cur = q.poll();

			if (isGoal(cur, SPos)) {
				System.out.println(cur.steps);
				return;
			}

			for (int[] d : dirs) {
				int nr = cur.r + d[0];
				int nc = cur.c + d[1];

				List<int[]> newCells = new ArrayList<>();
				if (cur.orientation == 0) {
					newCells.add(new int[] { nr, nc });
					newCells.add(new int[] { nr, nc + 1 });
				} else {
					newCells.add(new int[] { nr, nc });
					newCells.add(new int[] { nr + 1, nc });
				}

				boolean valid = true;
				for (int[] cell : newCells) {
					int rr = cell[0], cc = cell[1];
					if (rr < 0 || rr >= M || cc < 0 || cc >= N || grid[rr][cc] == 'H') {
						valid = false;
						break;
					}
				}

				if (valid) {
					State newState = new State(nr, nc, cur.orientation, cur.steps + 1);
					if (!visited.contains(newState)) {
						visited.add(newState);
						q.offer(newState);
					}
				}
			}

			if (cur.r + 1 < M && cur.c + 1 < N) {
				boolean free = true;
				for (int dr = 0; dr <= 1; dr++) {
					for (int dc = 0; dc <= 1; dc++) {
						int rr = cur.r + dr, cc = cur.c + dc;
						if (grid[rr][cc] == 'H') {
							free = false;
							break;
						}
					}
					if (!free)
						break;
				}
				if (free) {
					int newOrientation = 1 - cur.orientation;
					State newState = new State(cur.r, cur.c, newOrientation, cur.steps + 1);
					if (!visited.contains(newState)) {
						visited.add(newState);
						q.offer(newState);
					}
				}
			}
		}

		System.out.println("Impossible");
	}

	private static boolean isGoal(State state, List<int[]> SPos) {
		Set<String> sofaCells = new HashSet<>();
		if (state.orientation == 0) {
			sofaCells.add(state.r + "," + state.c);
			sofaCells.add(state.r + "," + (state.c + 1));
		} else {
			sofaCells.add(state.r + "," + state.c);
			sofaCells.add((state.r + 1) + "," + state.c);
		}

		Set<String> destCells = new HashSet<>();
		for (int[] pos : SPos) {
			destCells.add(pos[0] + "," + pos[1]);
		}

		return sofaCells.equals(destCells);
	}
}