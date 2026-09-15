package stack;

class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s1 = "(()())(())";
        String s2 = "(()())(())(()(()))";
        String s3 = "()()";

        System.out.println(removeOuterParentheses(s1));
        System.out.println(removeOuterParentheses(s2));
        System.out.println(removeOuterParentheses(s3));
    }
}