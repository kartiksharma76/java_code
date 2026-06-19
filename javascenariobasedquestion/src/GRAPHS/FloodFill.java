package GRAPHS;

public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if (image[sr][sc] == color)
			return image;
		dfs(image, sr, sc, image[sr][sc], color);
		return image;
	}

	private void dfs(int[][] img, int i, int j, int orig, int newColor) {
		if (i < 0 || i >= img.length || j < 0 || j >= img[0].length || img[i][j] != orig)
			return;
		img[i][j] = newColor;
		dfs(img, i + 1, j, orig, newColor);
		dfs(img, i - 1, j, orig, newColor);
		dfs(img, i, j + 1, orig, newColor);
		dfs(img, i, j - 1, orig, newColor);
	}

	public static void main(String[] args) {
		FloodFill sol = new FloodFill();
		int[][] img = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int[][] res = sol.floodFill(img, 1, 1, 2);
		for (int[] row : res) {
			for (int v : row)
				System.out.print(v + " ");
			System.out.println();
		}
	}
}