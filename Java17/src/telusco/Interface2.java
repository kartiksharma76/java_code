package telusco;

interface L {
//	public abstract void show();
//	public abstract void config();
	int age = 44;
	String area = "Mumbai";

	void show();

	void config();
}

class M implements L {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("In config");
	}

}

public class Interface2 {
	public static void main(String[] args) {
		L obj;
		obj = new M();
		obj.show();
		obj.config();
		// L.area="Hyderabad";

		System.out.println(L.area);
	}
}
