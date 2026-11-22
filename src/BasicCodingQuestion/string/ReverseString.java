package BasicCodingQuestion.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
         //   System.out.println(rev);
        }
        System.out.println(new StringBuilder(str).reverse());
    }
}
