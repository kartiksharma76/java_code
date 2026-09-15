package TypeCasting;
// A b=(C)d here A and C are classes and b and d are  variable are reference variable
// compile time checking
//1.there must have sum relationship between type of d and C 
//2.  C must be  same or child of A

// RUN TIME CHECKING
// the underline object type of d must be same or child of C

public class CastingTest {
public static void main(String[] args) {
	A a=new C();
	B b=(B)a;
//	C c=(B)a; // B is not a child of C,hence compilation error
	A a1=new F();
	// RUN TIME CHECKING
	// underline object of a1 is F
	//F E(not same)
	// F,E(is F  a child of E) yes
	
	D d=(E)a1;// 1.E and type of a1 has parent child relation 
              //2. E is a child of D
	A a2= new F();
	//A a3=(B)a2;// compile time checking
	//1.type of a2 (A) and B has some relation 
	//2.B A not same 
	//3.B A  B is a child of A
	
	// Run Time Checking
	// underline object of a2 is F
	// F B (not same)
    // F ,B  is F a child B (NO)
	
	A a4= new C();
	 //A a5=(D)a4;
	// compile time checking 
	//1. type of a4 (A)and C has some relation 
	//2.D A not same
	//3. D A , D  is a child of A(yes)
	
	//Run time checking
	// underline object of a4 is C
	// C D not same
	// C,D (C is a child of D) NO
	 
	 Object o=new E();
	 // A a6= (B)o;
	 
	  B b2=(B)o;
	 //B b3= (D)o;
}
}
