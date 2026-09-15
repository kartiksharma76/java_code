package namingconflict;
/*
 * 1.method signature same and return type same(No confusion) means you can implement only one method
 * 2.method signature same and return type different(confusion)
 * 3.method name same and argument list is  different and return type same(implement both the methods)
 * 
 */
public class A implements X,Y{

	@Override
	public int m1(int a) {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	
}
