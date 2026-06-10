package Enum;

class Student {
	private String name = "Kartik";

	class Info {
		void display() {
			System.out.println(name);
		}
	}
}

class Member {
	public static void main(String[] args) {
		Student s = new Student();

		Student.Info i = s.new Info();

		i.display();
	}
}