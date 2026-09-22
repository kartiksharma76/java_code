package Pattern;

public class SameAlphabetPattern {
    public static void main(String[] args) {
        for(int i = 'A'; i<= 'E'; i++){
            for (char j = 'A'; j<= i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
