package InfosysSpringboard;

class LCM {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        
        System.out.println(findLCM(num1, num2));
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}