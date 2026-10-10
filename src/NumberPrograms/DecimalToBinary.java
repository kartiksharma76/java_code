package NumberPrograms;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary = binary + remainder * place;
            place = place * 10;
            num = num / 2;
        }
        System.out.println("Binary :" + binary);
    }
}
