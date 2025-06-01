package Test;

public class NegativeArraySize {
public static void main(String[] args) {
	int ints[]=get(-1);
	System.out.println(ints.length);
}
public static int[]get(int x){
	return new int[x];
	
}
}
// negative array size exception
