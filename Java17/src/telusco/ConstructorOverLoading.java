package telusco;
//this ()represent constructor and it is helpful to call another constructor like below
//if you call a method it self then it will throw exception at run time
//but if you call a constructor it self then compiler give you compilation error
public class ConstructorOverLoading {
   public ConstructorOverLoading() {
	   this(10);
	   System.out.println("no argument");
   }

public ConstructorOverLoading(int a) {
	this(10,20);
	System.out.println("one argument");
}

public ConstructorOverLoading(int a, int b) {
	// TODO Auto-generated constructor stub
	//this(10,20);
	System.out.println("Two argument");
}
public static void main(String[] args) {
	ConstructorOverLoading c = new ConstructorOverLoading();
	
}
}
