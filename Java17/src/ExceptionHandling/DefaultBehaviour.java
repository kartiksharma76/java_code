package ExceptionHandling;
/**
 * 1.if an Exception is raised inside any method,then the method is responsible to create an Exception object with the following information
 */
public class DefaultBehaviour {
 public void m1() {
	 System.out.println("m1");
	 m2();
 }
 public void m2() {
	 m3();
	 System.out.println("m2");
	 
 }
 public void m3() {
	 m4();
	 System.out.println("m3");
 }
 public void m4() {
	 m5();
	 System.out.println("m4");
 }
 public void m5() {
	int c= 10/0;
	 System.out.println("m5");
 }
 public static void main(String[] args) {
	DefaultBehaviour d=new DefaultBehaviour();
	d.m1();
	System.out.println("main method end");
}
}
