package RGPV;

public class Derived1 extends BaseClass {
		int age;
		
		void showDetails() {
			System.out.println("name:"+Name);
			System.out.println("Age:"+age);
			
		}
		public Derived1() {
			System.out.println("this is derived");
		}
	public static void main(String[] args) {
		Derived1 d=new Derived1();
		d.age=20;
		d.Name="kartik";
		d.Display();
		d.showDetails();
	
}
}