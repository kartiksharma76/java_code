package DsaQuestions.GoldmanSachs;

public class CopyArrayClone {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = arr.clone();

        for (int x : copy) {
            System.out.println(x + " ");
        }
    }
}
