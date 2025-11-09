package HackerRank;

/**
 * 2
1 2 3
1 3 2
Cat B
Mouse C
 */
import java.io.*;
import java.util.*;

class G {
	public static String catAndMouse(int x, int y, int z) {
		int distA = Math.abs(x - z);
		int distB = Math.abs(y - z);

		if (distA < distB)
			return "Cat A";
		else if (distB < distA)
			return "Cat B";
		else
			return "Mouse C";
	}
}

public class CatAndMouse {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = bufferedReader.readLine().trim().split(" ");

			int x = Integer.parseInt(xyz[0]);
			int y = Integer.parseInt(xyz[1]);
			int z = Integer.parseInt(xyz[2]);

			String result = G.catAndMouse(x, y, z);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedReader.close();
		bufferedWriter.close();
	}
}
