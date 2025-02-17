package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
public static void main(String[] args) {
	Consumer<Integer> con = t -> System.out.println(t);
	con.accept(50);
	// R apply(T t); Function<T, R> prince
			Function<Integer, String> fun = t -> "prince";
			String result = fun.apply(10);
			System.out.println(result);
			// boolean test(T t); Predicate<T> kartik
			Predicate<Integer> pre = t -> t % 6 == 0;
			boolean test = pre.test(60);
			System.out.println(test);
			// T get(); Supplier<T> twinkle
			Supplier<Integer> s = () -> 20;
			System.out.println(s.get());
			// void accept(int value); IntConsumer ritika
			IntConsumer con1 = v -> System.out.println(v);
			con1.accept(100);

}
}
