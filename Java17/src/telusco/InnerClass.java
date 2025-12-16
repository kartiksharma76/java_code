package telusco;

class G {
	int age;

	public void show() {
		System.out.println("in show");
	}

//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}

	static class H {
		public void config() {
			System.out.println("in config");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		G obj = new G();
		obj.show();

//	G.H obj1 = obj.new H();
//	obj1.config();
		G.H obj1 = new G.H();
		obj1.config();
	}
}
