package DsaQuestions.Hardestproblem;


import java.util.*;

public class FallingSquares {

    public static List<Integer> fallingSquares(int[][] positions) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int[] p : positions) {
            set.add(p[0]);
            set.add(p[0] + p[1]);
        }

        Map<Integer, Integer> index = new HashMap<>();
        int id = 0;

        for (int x : set) {
            index.put(x, id++);
        }

        // Each leaf represents an interval between endpoints.
        SegmentTree tree = new SegmentTree(set.size() - 1);

        List<Integer> answer = new ArrayList<>();
        int globalMax = 0;

        for (int[] p : positions) {
            int left = index.get(p[0]);
            int right = index.get(p[0] + p[1]) - 1;

            int baseHeight = tree.query(left, right);
            int newHeight = baseHeight + p[1];

            tree.update(left, right, newHeight);

            globalMax = Math.max(globalMax, newHeight);
            answer.add(globalMax);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] positions = {{1, 2}, {2, 3}, {6, 1}};

        System.out.println(fallingSquares(positions));
        // Output: [2, 5, 5]
    }

    static class SegmentTree {
        int[] max;
        int[] lazy;
        int n;

        SegmentTree(int n) {
            this.n = n;
            max = new int[4 * n];
            lazy = new int[4 * n];
        }

        void apply(int node, int height) {
            max[node] = height;
            lazy[node] = height;
        }

        void push(int node) {
            if (lazy[node] != 0) {
                apply(node * 2, lazy[node]);
                apply(node * 2 + 1, lazy[node]);
                lazy[node] = 0;
            }
        }

        int query(int node, int left, int right, int ql, int qr) {
            if (ql <= left && right <= qr) {
                return max[node];
            }

            push(node);
            int mid = left + (right - left) / 2;
            int answer = 0;

            if (ql <= mid) {
                answer = Math.max(answer, query(node * 2, left, mid, ql, qr));
            }

            if (qr > mid) {
                answer = Math.max(answer, query(node * 2 + 1, mid + 1, right, ql, qr));
            }

            return answer;
        }

        void update(int node, int left, int right, int ql, int qr, int height) {
            if (ql <= left && right <= qr) {
                apply(node, height);
                return;
            }

            push(node);
            int mid = left + (right - left) / 2;

            if (ql <= mid) {
                update(node * 2, left, mid, ql, qr, height);
            }

            if (qr > mid) {
                update(node * 2 + 1, mid + 1, right, ql, qr, height);
            }

            max[node] = Math.max(max[node * 2], max[node * 2 + 1]);
        }

        int query(int left, int right) {
            return query(1, 0, n - 1, left, right);
        }

        void update(int left, int right, int height) {
            update(1, 0, n - 1, left, right, height);
        }
    }
}
