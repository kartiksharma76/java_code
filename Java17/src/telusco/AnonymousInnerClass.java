package telusco;
class J
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class AnonymousInnerClass {
public static void main(String[] args) {
	J obj = new J() {
		public void show() {
			System.out.println("In new Show");
			
		}
	};
	obj.show();
}
}
