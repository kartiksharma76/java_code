package tries;

public class MaximumXOR {
	static class TrieNode {
		TrieNode[] ch = new TrieNode[2];
	}

	TrieNode root = new TrieNode();

	private void insert(int num) {
		TrieNode cur = root;
		for (int i = 31; i >= 0; i--) {
			int bit = (num >> i) & 1;
			if (cur.ch[bit] == null)
				cur.ch[bit] = new TrieNode();
			cur = cur.ch[bit];
		}
	}

	private int maxXOR(int num) {
		TrieNode cur = root;
		int xor = 0;
		for (int i = 31; i >= 0; i--) {
			int bit = (num >> i) & 1, want = 1 - bit;
			if (cur.ch[want] != null) {
				xor += (1 << i);
				cur = cur.ch[want];
			} else
				cur = cur.ch[bit];
		}
		return xor;
	}

	public int findMaximumXOR(int[] nums) {
		for (int n : nums)
			insert(n);
		int max = 0;
		for (int n : nums)
			max = Math.max(max, maxXOR(n));
		return max;
	}

	public static void main(String[] args) {
		MaximumXOR sol = new MaximumXOR();
		System.out.println(sol.findMaximumXOR(new int[] { 3, 10, 5, 25, 2, 8 })); // 28
	}

}
