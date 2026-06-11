package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.IntConsumer;

public class LambdaExpressionPractice {
	public static void main(String[] args) {
//	void accept(T t);
		// two value consume is use byconsumer
		Consumer<Integer> con = t -> System.out.println(t);
		con.accept(50);
		// R apply(T t); Function<T, R> prince
		Function<Integer, String> fun = t -> "prince";// takes value return values
		String result = fun.apply(10);
		System.out.println(result);
		// boolean test(T t); Predicate<T> kartik
		Predicate<Integer> pre = t -> t % 2 == 0;
		boolean test = pre.test(4);// true or false
		System.out.println(test);
		// T get(); Supplier<T> twinkle
	
		Supplier<Integer> s = () -> 20;
		System.out.println(s.get());
		// void accept(int value); IntConsumer ritika
		// takes nothing 
		IntConsumer con1 = v -> System.out.println(v);
		con1.accept(100);

	}
}
