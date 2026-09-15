package telusco;
interface Computer{
	void code();
}
class Laptop1 implements Computer{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("code ,complie,run ");
	}
	
}
class Desktop implements Computer{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("code ,compile,faster");
	}
	
}
class devloper{
	// public void devApp(Laptop lap)
	public void devApp(Computer lap) {
		lap.code();
	}
}
public class NeedOfInterface {
public static void main(String[] args) {
//Laptop lap = new Laptop();
//	Desktop dsk = new Desktop();
	Computer lap = new Laptop1();
	Computer dsk = new Desktop();
	devloper navin = new devloper();
	navin.devApp(lap);
}
}
