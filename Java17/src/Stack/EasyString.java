package StackQuestions;

import java.util.Scanner;

public class EasyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compress(s));
        sc.close();
    }

    public static String compress(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        char prev = Character.toLowerCase(s.charAt(0));
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char curr = Character.toLowerCase(s.charAt(i));
            if (curr == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                prev = curr;
                count = 1;
            }
        }
        result.append(count).append(prev);

        return result.toString();
    }
}//aaABBb
