package LinkedListProblems;

public class MidClaculateTest1 {
	public static void main(String[] args) {
		midCalculate1 mid = new midCalculate1();
		System.out.println("original data");
		mid.insert(2);
		mid.insert(4);
		mid.insert(6);
		mid.insert(7);
		mid.insert(5);
		mid.insert(1);
		mid.print();
		System.out.println("mid data:" + mid.mid());

	}
}
