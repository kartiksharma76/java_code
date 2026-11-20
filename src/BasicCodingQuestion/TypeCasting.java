package BasicCodingQuestion;

public class TypeCasting {
    public static void main(String[] args) {
        int i =9;
        double d = i;
        double x = 9.78;
        int y = (int) x;

        long l = 100L;
        int z = (int) l;

        char c = 'a';
        int code = c;
        float f = 5;
        System.out.println(d +  " " + y + " " + z + " " + code + " " + f);
    }
}
