package nqttop150;

import java.util.HashSet;
import java.util.Set;

public class Suduko {
	public static boolean isvalidsudoko(char[][] board) {
		for (int i = 0; i < 9; i++) {
			Set<Character> row = new HashSet<>();
			Set<Character> column = new HashSet<>();
			Set<Character> box = new HashSet<>();

			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (!row.add(board[i][j])) {
						return false;
					}

				}
				if (board[j][i] != '.') {
					if (!column.add(board[j][i])) {
						return false;
					}
				}
				int rowIndex = 3 * (i / 3);
				int columnIndex = 3 * (i % 3);

				char boxval = board[rowIndex + j / 3][columnIndex + j % 3];
				if (boxval != '.') {
					if (!box.add(boxval)) {
						return false;
					}
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
				{ '4', '.', '.', '5', '.', '.', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
				{ '5', '.', '.', '.', '6', '.', '.', '.', '4' }, { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '8' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println(isvalidsudoko(board));
	}
}
