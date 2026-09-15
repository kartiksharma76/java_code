package ArrayQuestion;

public class EvenOddCount1 {
public static void main(String[] args) {
	int []arr= {1,6,18,7};
	int evencount=0;
	int oddcount=0;
	for(int num:arr) {
		if(num%2==0) {
			evencount++;
		}else {
			oddcount++;
		}
	}
	System.out.println(oddcount+" "+evencount);
}
}
