package telusco;
//class - class -> extends
//class - interface -> implements
//interface - interface -> extends
interface N{
//	public abstract void show();
//	public abstract void config();
	int age = 44;
	String area = "Mumbai";
	void show();
	void config();
}
interface X{
	void run();
}
interface Y extends X{
	
}
class O implements N,Y{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running...");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("in show");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("in cofing");
	}

	
}
public class MoreOmInterfaces {
public static void main(String[] args) {
	N obj;
	obj = new O();
	obj.show();
	obj.config();
	
	
	X obj1=new O();
	obj1.run();
	
	 //   	A.area="Hyderabad";
	
	System.out.println(O.area);
}
}
