package strings;

public class MultiplyTwoString {

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "45";

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int num : result) {

            if (!(ans.length() == 0 && num == 0)) {
                ans.append(num);
            }
        }

        System.out.println(ans.length() == 0 ? "0" : ans.toString());
    }
}
