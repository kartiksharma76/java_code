package BasicCodingQuestion.string;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "I love Java";
        StringBuilder sb = new StringBuilder();
        for (String w : s.split(" "))
            sb.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println(sb.toString().trim());   // I evol avaJ
    }
}
