package LinkedListProblems;

public class MidTestCalculate {
	public static void main(String[] args) {
		MidCalculate mid = new MidCalculate();
		System.out.println("print original data:");
		mid.insert(1);
		mid.insert(2);
		mid.insert(3);
		mid.insert(4);
		mid.insert(5);
		mid.print();

		System.out.println("print mid data after calculation:" + mid.mid ());
	}
}
