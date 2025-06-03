package LinkedListProblems;

public class CalculateLengthOfEvenTest {
public static void main(String[] args) {
	CalculateLengthOfEven ll=new CalculateLengthOfEven();
	ll.insert(12);
	ll.insert(52);
	ll.insert(10);
	ll.insert(47);
	ll.insert(95);
	ll.insert(0);
	System.out.println("size:"+ll.size());
	System.out.println(ll.equals(ll));


	
}
}