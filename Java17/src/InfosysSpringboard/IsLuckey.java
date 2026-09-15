package InfosysSpringboard;

class IsLuckey {
    public static void main(String[] args) {
        int number = 1623; // Sample Input
        if (isLucky(number)) {
            System.out.println("The number " + number + " is a lucky number");
        } else {
            System.out.println("The number " + number + " is not a lucky number");
        }
    }

    public static boolean isLucky(int num) {
        String strNum = String.valueOf(num);
        int sumOfSquares = 0;

        // Start from index 1 (the second position) and skip every other digit
        for (int i = 1; i < strNum.length(); i += 2) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            sumOfSquares += digit * digit;
        }

        // A number is lucky if the sum is a multiple of 9
        return sumOfSquares % 9 == 0;
    }
}