package InfosysSpringboard;

class ReservedNumber {
    public static void main(String[] args) {
        int number = 1331; // Example input
        int temp = number;
        int reversedNumber = 0;
        int remainder;

        // Use iteration to reverse the number
        while (temp > 0) {
            remainder = temp % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            temp = temp / 10;
        }

        // Check if original number and reversed number are equal
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}