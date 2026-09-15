package RGPV;

public class Gparent {
	void property() {
		System.out.println("g property");
	}
}

class Parent1 extends Gparent {
	void property() {
		System.out.println("parent property");
	}
}

class Child1 extends Gparent {
	void property() {
		System.out.println("child property");
	}

}
