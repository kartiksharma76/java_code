package litcodecontest;

class Q1_MaximumManhattanDistance {

	/*
	 * Problem Statement:
	 *
	 * You are given a string moves consisting of: 'U' -> Up 'D' -> Down 'L' -> Left
	 * 'R' -> Right '_' -> Can be replaced with any direction.
	 *
	 * Starting from (0,0), determine the maximum possible Manhattan Distance from
	 * the origin after performing all moves.
	 *
	 * Manhattan Distance = |x| + |y|
	 *
	 * Example: Input : "L_D_" Output: 4
	 */

	public static int maxDistance(String moves) {

		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;
		int wildcard = 0;

		for (char ch : moves.toCharArray()) {

			switch (ch) {

			case 'U':
				up++;
				break;

			case 'D':
				down++;
				break;

			case 'L':
				left++;
				break;

			case 'R':
				right++;
				break;

			default:
				wildcard++;
			}
		}

		int x = right - left;
		int y = up - down;

		return Math.abs(x) + Math.abs(y) + wildcard;
	}

	public static void main(String[] args) {

		String moves = "L_D_";

		int answer = maxDistance(moves);

		System.out.println("Moves : " + moves);
		System.out.println("Maximum Manhattan Distance : " + answer);
	}
}