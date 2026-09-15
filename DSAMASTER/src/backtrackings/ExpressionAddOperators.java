package backtrackings;

import java.util.*;

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        backtrack(num, target, 0, "", 0, 0, res);
        return res;
    }
    private void backtrack(String num, int target, int idx, String path, long curVal, long prevOperand, List<String> res) {
        if (idx == num.length()) {
            if (curVal == target) res.add(path);
            return;
        }
        for (int i = idx; i < num.length(); i++) {
            if (i != idx && num.charAt(idx) == '0') break; // no leading zeros
            long curNum = Long.parseLong(num.substring(idx, i + 1));
            if (idx == 0) {
                backtrack(num, target, i + 1, path + curNum, curNum, curNum, res);
            } else {
                backtrack(num, target, i + 1, path + "+" + curNum, curVal + curNum, curNum, res);
                backtrack(num, target, i + 1, path + "-" + curNum, curVal - curNum, -curNum, res);
                backtrack(num, target, i + 1, path + "*" + curNum,
                          curVal - prevOperand + prevOperand * curNum, prevOperand * curNum, res);
            }
        }
    }
}
