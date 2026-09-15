package Test;

public class CompilationFail {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };

		if (arr.length == 0)
			System.out.println("==0");
		System.out.println(arr.length);
		// else if(arr.length>0)
		System.out.println(">0");
//	else
		System.out.println("?");
	}
}
//compilation fail