package hashmapping;

// Design HashMap (chaining based implementation)
public class DesignHashMap {
    private static final int SIZE = 10007;
    private final Node[] buckets = new Node[SIZE];

    private static class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }

    public void put(int key, int value) {
        int idx = key % SIZE;
        Node cur = buckets[idx];
        while (cur != null) {
            if (cur.key == key) { cur.value = value; return; }
            cur = cur.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[idx];
        buckets[idx] = newNode;
    }

    public int get(int key) {
        int idx = key % SIZE;
        Node cur = buckets[idx];
        while (cur != null) {
            if (cur.key == key) return cur.value;
            cur = cur.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = key % SIZE;
        Node cur = buckets[idx], prev = null;
        while (cur != null) {
            if (cur.key == key) {
                if (prev == null) buckets[idx] = cur.next;
                else prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}
