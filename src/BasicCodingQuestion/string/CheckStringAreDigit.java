package BasicCodingQuestion.string;

public class CheckStringAreDigit {
    public static void main(String[] args) {
        String s = "12345";
        System.out.println(s.matches("\\d+"));
        // true boolean ok = !s.isEmpty();
        // for (char c : s.toCharArray()) if (!Character.isDigit(c)) ok = false;
        // System.out.println(ok);                  // true
    }
}
