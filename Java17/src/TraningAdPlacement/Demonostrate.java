package TraningAdPlacement;

public class Demonostrate {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pre: " + (++a));   // 6
        System.out.println("Post: " + (a++));  // 6 (then a becomes 7)
        System.out.println("Now a: " + a);     // 7
    }
}