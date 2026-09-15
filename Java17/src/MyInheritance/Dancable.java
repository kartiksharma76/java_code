package MyInheritance;

public interface Dancable {
 void myDance() ;
	 public  default void bollywoodDance() {
		 System.out.println("bollywood dance");
	 }
 
}
