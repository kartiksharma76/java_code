package Stream;

import java.util.stream.Stream;

public class InfiniteStream {
	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
	}
}
