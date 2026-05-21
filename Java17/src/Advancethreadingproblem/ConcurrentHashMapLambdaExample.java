package Advancethreadingproblem;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapLambdaExample {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C++");

		map.forEach((k, v) -> {

			System.out.println(k + " : " + v);
		});
	}
}