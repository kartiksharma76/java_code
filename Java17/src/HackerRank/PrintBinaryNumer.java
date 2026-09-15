package HackerRank;

public class PrintBinaryNumer {
public static void main(String[] args) {
	for(int i=0;i<=20;i++) {
		String binary=Integer.toBinaryString(i);
		System.out.println(i+"->"+binary);
	}
}
}
