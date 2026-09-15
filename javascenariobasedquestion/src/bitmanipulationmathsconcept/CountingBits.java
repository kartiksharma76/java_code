package bitmanipulationmathsconcept;

public class CountingBits {
	public int[] countBits(int n) {
		int[] ans = new int[n + 1];
		for (int i = 1; i <= n; i++)
			ans[i] = ans[i >> 1] + (i & 1);
		return ans;

	}

	public static void main(String[] args) {
		CountingBits sol = new CountingBits();
		int[] res = sol.countBits(5);
		for (int x : res)
			System.out.print(x + " ");
	}
}
