package Pattern;

public class AlphabetTriangle {
    public static void main(String[] args) {
        for (int i ='A'; i<='E'; i++){
            for (int j = 'A'; j<=i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
