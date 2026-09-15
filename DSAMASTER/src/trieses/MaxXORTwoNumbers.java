package trieses;

// Maximum XOR of Two Numbers in an Array (bitwise trie, 32-bit ints)
public class MaxXORTwoNumbers {
    private static class Node {
        Node[] children = new Node[2];
    }
    private final Node root = new Node();

    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        for (int num : nums) insert(num);
        for (int num : nums) {
            maxXor = Math.max(maxXor, query(num));
        }
        return maxXor;
    }

    private void insert(int num) {
        Node cur = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (cur.children[bit] == null) cur.children[bit] = new Node();
            cur = cur.children[bit];
        }
    }

    private int query(int num) {
        Node cur = root;
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int want = 1 - bit;
            if (cur.children[want] != null) {
                result |= (1 << i);
                cur = cur.children[want];
            } else {
                cur = cur.children[bit];
            }
        }
        return result;
    }
}
