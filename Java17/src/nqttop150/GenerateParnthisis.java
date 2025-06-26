package nqttop150;

import java.util.ArrayList;
import java.util.List;

public class GenerateParnthisis {
	List<String> generateParnthiss(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, n);
		return result;

	}

	private void backtrack(List<String> result, String current, int i, int j, int n) {
		if (current.length() == n * 2) {
			result.add(current);
			return;
		}
		if (i < n) {
			backtrack(result, current + "(", i + 1, j, n);
			if (j < i) {
				backtrack(result, current + ")", i, j + 1, n);
			}

		}

	}

	public static void main(String[] args) {
		GenerateParnthisis gp = new GenerateParnthisis();
		//List<String>output=gp.generateParnthiss(3);
		System.out.println(gp.generateParnthiss(1));
		//System.out.println(output);
	}
}
