package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDeque {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int m = scanner.nextInt(); 
	        Deque<Integer> deque = new ArrayDeque<>();
	        Map<Integer, Integer> map = new HashMap<>();
	        int maxUnique = 0;

	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();

	            deque.addLast(num);
	            map.put(num, map.getOrDefault(num, 0) + 1);

	            if (deque.size() == m) {
	                maxUnique = Math.max(maxUnique, map.size());

	                // Remove from front of deque
	                int removed = deque.removeFirst();
	                if (map.get(removed) == 1) {
	                    map.remove(removed);
	                } else {
	                    map.put(removed, map.get(removed) - 1);
	                }
	            }
	        }

	        System.out.println(maxUnique);
	    }
}
