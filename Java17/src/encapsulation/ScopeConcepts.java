package encapsulation;

public class ScopeConcepts {
 int a=20;
 static int b=30;
 public void setData(int a) {
final int b=20;
	 System.out.println(a); 
	 System.out.println(this.a);
	 System.out.println(b);
 }
 public static void main(String[] args) {
	ScopeConcepts concepts=new ScopeConcepts();
	concepts.setData(40);
	System.out.println(concepts.a);
	
}
}
