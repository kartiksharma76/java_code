package InfosysSpringboard;

class Seed {
    public static void main(String[] args) {
        int x = 123;
        int y = 738;
        
        if (isSeed(x, y)) {
            System.out.println(x + " is a seed of " + y);
        } else {
            System.out.println(x + " is not a seed of " + y);
        }
    }

    public static boolean isSeed(int x, int y) {
        int product = x;
        int temp = x;

        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        return product == y;
    }
}