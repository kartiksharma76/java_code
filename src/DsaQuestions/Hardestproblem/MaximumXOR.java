package DsaQuestions.Hardestproblem;


public class MaximumXOR {

    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
    }

    static TrieNode root = new TrieNode();

    static void insert(int num) {
        TrieNode node = root;

        for (int bit = 31; bit >= 0; bit--) {
            int b = (num >>> bit) & 1;

            if (node.child[b] == null) {
                node.child[b] = new TrieNode();
            }

            node = node.child[b];
        }
    }

    static int findMaxXor(int num) {
        TrieNode node = root;
        int xor = 0;

        for (int bit = 31; bit >= 0; bit--) {
            int b = (num >>> bit) & 1;
            int opposite = 1 - b;

            if (node.child[opposite] != null) {
                xor |= (1 << bit);
                node = node.child[opposite];
            } else {
                node = node.child[b];
            }
        }

        return xor;
    }

    public static int maximumXOR(int[] nums) {
        root = new TrieNode();
        for (int num : nums) insert(num);

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, findMaxXor(num));
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println(maximumXOR(nums)); // 28
    }
}
