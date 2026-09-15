package HackerRank;

import java.util.BitSet;
import java.util.Scanner;

public class Bitset {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
    BitSet b1=new BitSet(n);
    BitSet b2=new BitSet(n);
    
    for(int i=0; i<m; i++){
        String op=sc.next();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        BitSet first=(x==1)? b1:b2;
        BitSet second=(y==1)? b1:b2;
        
        switch(op){
            case"AND":first.and(second);
            break;
            case "OR":first.or(second);
            break;
            case"XOR":first.xor(second);
            break;
            case "FLIP":first.flip(y);
            break;
            case "SET":first.set(y);
            break;
        }
        System.out.println(b1.cardinality()+" "+b2.cardinality());
    }
    sc.close();
    }
}
