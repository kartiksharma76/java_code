package RGPV;

public class GparentTest {
	public static void main(String[] args) {
		Gparent myGparent=new Gparent();
		myGparent=new Parent1();
		myGparent.property();
		
		myGparent=new Child1();
		myGparent.property();
	}
}
