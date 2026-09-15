package InfosysSpringboard;

class IsArmstrong {
    public static void main(String[] args) {
        int number = 1635; // Replace with input to test
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // Get the number of digits

        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }

        return result == originalNum;
    }
}