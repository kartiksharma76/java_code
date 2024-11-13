package encapsulation;

/**
 * calling order in method overloading 1.exact matching
 * 2.byte,short,int,long,float,double (if not exact matching then compiler will
 * search next immediate primitive their matching ) char,int,long,float,double
 * 3.exact matching wrapper class only 4.matching var argument 5. compilation
 * error
 * 
 */
public class MethodOverloadingConcepts {
//	  public static void m1(byte b) {
//		  System.out.println("byte");
//	  }
//	  public static void m1(int a) { 
//		  System.out.println("int");
//	  }
//	  public static void m1(short a) {
//		  System.out.println("short");
//	  }
	public static void m1(char a) {
		System.out.println("char");
	}

//	  public static void m1(long a) {
//		  System.out.println("long");
//	  }
//	  public static void m1(Integer a) {
//		  System.out.println("Integer");
//	  }
	public static void m1(Long a) {
		System.out.println("Long");
	}

	public static void m1(int... a) {
		System.out.println("var argument");
	}

	public static void m1(long a, int b) {
		System.out.println("long,int");
	}

	public static void m1(int a, long b) {
		System.out.println("int,long");
	}

	public static void main(String[] args) {
		m1(10);
		byte b = 20;
		// m1(b);

	}

}
