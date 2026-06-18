package trenningjava;

@FunctionalInterface
interface  Greeting{
String greet(String name);
}
interface Arthematic {
	int sum(int a, int b);
}
public class FunctionDemo {
public static void main(String[] args) {
	Greeting g = (name)->"Hello"+ name;
	System.out.println(g.greet("Zubir"));
	
	Arthematic at = (a,b)->a+b;
	System.out.println(at.sum(10, 20));
}
}
