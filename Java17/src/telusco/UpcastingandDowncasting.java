package telusco;
class E{
	public void show(){
		System.out.println("in A show");
	}
}
class F extends E{
	public void show1() {
		System.out.println("in show F");
		
	}
}
public class UpcastingandDowncasting {
public static void main(String[] args) {
//	double d=4.5;
//	int i=(int)d;
//	
//	System.out.println(i);
	
//	E obj= new E();
//	E obj=(E) new F();   //upcasting
//	obj.show1();
	
	E obj = new F();
	obj.show();
	
	F obj1 = (F)obj;
	obj1.show1();
}
}
