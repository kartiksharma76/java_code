package matricAndarray;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		Set<String> seen = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c == '.')
					continue;
				String row = "row" + i + c;
				String col = "col" + j + c;
				String box = "box" + (i / 3) + (j / 3) + c;

				if (!seen.add(row) || !seen.add(col) || !seen.add(box))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Valid Sudoku checker imlemented");
	}
}
