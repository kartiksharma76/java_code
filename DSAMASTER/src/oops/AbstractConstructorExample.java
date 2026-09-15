package oops;

abstract class University {

	University() {
		System.out.println("University Constructor");
	}

	abstract void department();
}

class EngineeringDepartment extends University {

	@Override
	void department() {
		System.out.println("Computer Science Department");
	}
}

public class AbstractConstructorExample {

	public static void main(String[] args) {

		EngineeringDepartment department = new EngineeringDepartment();

		department.department();
	}
}