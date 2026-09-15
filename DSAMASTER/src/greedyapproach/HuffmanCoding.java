package greedyapproach;

import java.util.*;

// Huffman Coding - builds optimal prefix codes for characters based on frequency
public class HuffmanCoding {
    static class Node {
        char ch; int freq;
        Node left, right;
        Node(char ch, int freq) { this.ch = ch; this.freq = freq; }
        Node(int freq, Node left, Node right) { this.freq = freq; this.left = left; this.right = right; }
    }

    public Map<Character, String> buildHuffmanCodes(char[] chars, int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int i = 0; i < chars.length; i++) pq.add(new Node(chars[i], freq[i]));

        while (pq.size() > 1) {
            Node a = pq.poll(), b = pq.poll();
            pq.add(new Node(a.freq + b.freq, a, b));
        }
        Map<Character, String> codes = new HashMap<>();
        if (!pq.isEmpty()) buildCodes(pq.poll(), "", codes);
        return codes;
    }

    private void buildCodes(Node node, String code, Map<Character, String> codes) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            codes.put(node.ch, code.isEmpty() ? "0" : code);
            return;
        }
        buildCodes(node.left, code + "0", codes);
        buildCodes(node.right, code + "1", codes);
    }
}
