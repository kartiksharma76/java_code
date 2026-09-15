package stack;

class MinimumAddParentheses {

    public static int minAddToMakeValid(String s) {

        int open = 0;
        int add = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
            } else {

                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }

        return open + add;
    }

    public static void main(String[] args) {

        String s1 = "())";
        String s2 = "(((";
        String s3 = "()))((";
        String s4 = "()";

        System.out.println(minAddToMakeValid(s1));
        System.out.println(minAddToMakeValid(s2));
        System.out.println(minAddToMakeValid(s3));
        System.out.println(minAddToMakeValid(s4));
    }
}
