package RGPV;

public class Base {
	public void publicmethod() {
		System.out.println("public in base");
	}

	protected void protectedmethod() {
		System.out.println("protected in base");
	}
}

class Derived {
	private Base base = new Base();

	void derivedmethod() {
		base.publicmethod();
		base.publicmethod();
	}
}