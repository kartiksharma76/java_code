package DsaQuestions.Hardestproblem;

public class MaximumXORTrie {
    static Node root = new Node();

    static void insert(int num) {
        Node node = root;

        for (int bit = 31; bit >= 0; bit--) {
            int b = (num >>> bit) & 1;

            if (node.child[b] == null) {
                node.child[b] = new Node();
            }
            node = node.child[b];
        }
    }

    static int query(int num) {
        Node node = root;
        int xor = 0;

        for (int bit = 31; bit >= 0; bit--) {
            int b = (num >>> bit) & 1;
            int opposite = b ^ 1;

            if (node.child[opposite] != null) {
                xor |= (1 << bit);
                node = node.child[opposite];

            } else {
                node = node.child[b];
            }
        }
        return xor;
    }

    static int findMaximumXOR(int[] nums) {
        root = new Node();

        for (int num : nums) {
            insert(num);
        }
        int answer = 0;

        for (int num : nums) {
            answer = Math.max(answer, query(num));
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 15, 5, 25, 2, 8};
        System.out.println(findMaximumXOR(nums));
    }

    static class Node {
        Node[] child = new Node[2];
    }
}
