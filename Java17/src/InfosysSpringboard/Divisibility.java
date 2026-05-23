package InfosysSpringboard;

class Divisibility {
    public static void main(String[] args) {
        int number = 2250; // Replace with 123 to test the other case
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        // Check for divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is divisible by sum of its digits");
        } else {
            System.out.println(originalNumber + " is not divisible by sum of its digits");
        }
    }
}