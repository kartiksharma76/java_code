package LambdaExpression;

public class LambdaExpressionTest {
	public static void main(String[] args) {
//	public void m1();
		// InterF1 m1=()->{System.out.println("kartik");};
		InterF1 f1 = () -> System.out.println("kartik");
		f1.m1();
		// traditional approach
		InterF1 f2 = new A();
		f2.m1();
		// public void m1(int a, int b);
		InterF2 f3 = (int a, int b) -> {
			System.out.println(a + " " + b);

		};

		// in lambda expression argument type is optional
		// compiler knows automatically method argument type which is called type
		// inference.in functional interface ,it must contain
		// only one abstract method so the compiler can guess the argument type.
		InterF2 f4 = (a, b) -> {
			System.out.println(a + " " + b);

		};
		// in lambda expression ,inside body if there is only one statement then {} is
		// optional
		InterF2 f5 = (a, b) -> System.out.println(a + " " + b);
		f5.m1(50, 60);

	//	public int add(int a, int b);
		// by lambda expression definition
	InterF3 f6=	(int a,int b)->{
			return a+b;
		};
		InterF3 f7=	( a, b)->{
			return a+b;
		};
		InterF3 f8=	( a, b)-> a+b;
			int sum = f8.add(20, 30);
			System.out.println(sum);
		
		//	public void m1();
		InterF4 f9=	()->{
				System.out.println("twinkle");
			};
			InterF4 f10=()->System.out.println("twinkle");
				f10.m1();
				
			//	public void m1(String a);
			InterF5 f11=	(String s)->{
					System.out.println(s);
				};
				InterF5 f12=	( s)->{
					System.out.println(s);
				};
				InterF5 f13=s->{
					System.out.println(s);
				};
				InterF5 f14=s->System.out.println(s);
					f14.m1("ritika");
				
			
	}
	
	
}
