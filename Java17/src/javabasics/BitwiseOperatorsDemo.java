package operaters;
/**
 * a = 5 (binary: 101)
b = 3 (binary: 11)
a & b = 1
a | b = 7
a ^ b = 6
~a = -6
a << 1 = 10
a >> 1 = 2
a >>> 1 = 2
n = -8 (binary: 11111111111111111111111111111000)
n >> 2 = -2
n >>> 2 = 1073741822

 */
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   
        int b = 3;   
        System.out.println("a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); 
        // Bitwise OR
        System.out.println("a | b = " + (a | b)); 

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); 

        // Bitwise NOT
        System.out.println("~a = " + (~a)); 

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); 

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); 

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1));

        int n = -8;
        System.out.println("\nn = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("n >> 2 = " + (n >> 2));
        System.out.println("n >>> 2 = " + (n >>> 2));
    }
}
