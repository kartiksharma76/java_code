package Pattern;

public class ContineousNumberPattern {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num++);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
