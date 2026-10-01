package DsaQuestions.GoldmanSachs;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class Node{
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache( int capacity){
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    public  int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        addToFront(node);
        return node.value;
    }
    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            remove(node);
            addToFront(node);

            return;
        }

        // New node
        Node node =
                new Node(key, value);

        map.put(key, node);
        addToFront(node);

        // Capacity exceeded
        if (map.size() > capacity) {

            Node lru = tail.prev;

            remove(lru);

            map.remove(lru.key);
        }
    }
    // Remove node from linked list
    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void addToFront(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,10);
        cache.put(2,20);
        System.out.println(cache.get(1));
        cache.put(3, 30);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
    }
}
