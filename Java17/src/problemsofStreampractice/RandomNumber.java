package problemsofStreampractice;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
public static void main(String[] args) {
	Supplier<Integer>s=()->new Random().nextInt(50);
	int count=5;
	while(count-->0) {
		System.out.println(s.get()+" ");
	}
}
}
