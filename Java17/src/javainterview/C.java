package javainterview;
//class load start
//-> static variable x initialize hoga -> test() call
//-> test() -> Hello India print -> return x (default 0)
//-> x = 0 assign

//-> static block chalega -> SIB-1
//-> static block ke andar main(null) call ho raha hai

//-> main() (first call)
//-> started
//-> x:0
//-> ++x -> x = 1
//-> ended

//-> ab JVM original main() call karega

//-> main() (second call)
//-> started
//-> x:1
//-> ++x -> x = 2 (print nahi ho raha)
//-> ended
public class C {
	static int x = test();
	static {
		System.out.println("SIB-1");
		main(null);
	}

	static int test() {
		System.out.println("Hello india");
		return x;
	}

	public static void main(String[] args) {
		System.out.println("started");
		System.out.println("x:" + x);
		++x;
		System.out.println("ended");
	}
}
