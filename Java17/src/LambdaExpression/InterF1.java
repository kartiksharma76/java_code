package LambdaExpression;

@FunctionalInterface
public interface InterF1 {
public void m1();
//public void m2(); functional interface must contain only one abstract method
public default void m2() {
	System.out.println();
}
public default void m3() {
	System.out.println();
}
public default void m4() {
	System.out.println();
}
public static void m5() {
	System.out.println();
}
public static void m6() {
	System.out.println();
}
private void m7() {
	System.out.println();
}
}
