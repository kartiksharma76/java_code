package telusco;
abstract class K
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

public class AbstractAndAnonymousInnerClass {
	public static void main(String[] args) {
//	A obj=new B();
	
	K obj=new K() {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("in new show");
		}

		@Override
		public void config() {
			// TODO Auto-generated method stub
			
		}

	};
	obj.show();
	}
}


