package backtrackings;

import java.util.*;

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(s);
        visited.add(s);
        boolean found = false;
        while (!q.isEmpty()) {
            String cur = q.poll();
            if (isValid(cur)) { res.add(cur); found = true; }
            if (found) continue;
            for (int i = 0; i < cur.length(); i++) {
                if (cur.charAt(i) != '(' && cur.charAt(i) != ')') continue;
                String next = cur.substring(0, i) + cur.substring(i + 1);
                if (!visited.contains(next)) {
                    visited.add(next);
                    q.add(next);
                }
            }
        }
        return res;
    }
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') { count--; if (count < 0) return false; }
        }
        return count == 0;
    }
}
