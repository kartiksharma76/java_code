package trieses;

import java.util.*;

// Maximum XOR With an Element From Array (offline queries with constraint x <= m_i)
public class MaxXORElementFromArray {
    private static class Node {
        Node[] children = new Node[2];
    }
    private final Node root = new Node();

    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.sort(nums);
        int q = queries.length;
        Integer[] order = new Integer[q];
        for (int i = 0; i < q; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> queries[a][1] - queries[b][1]);

        int[] res = new int[q];
        int idx = 0;
        for (int qi : order) {
            int x = queries[qi][0], m = queries[qi][1];
            while (idx < nums.length && nums[idx] <= m) {
                insert(nums[idx]);
                idx++;
            }
            res[qi] = idx == 0 ? -1 : query(x);
        }
        return res;
    }

    private void insert(int num) {
        Node cur = root;
        for (int i = 29; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (cur.children[bit] == null) cur.children[bit] = new Node();
            cur = cur.children[bit];
        }
    }

    private int query(int num) {
        Node cur = root;
        int result = 0;
        for (int i = 29; i >= 0; i--) {
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
