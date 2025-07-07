package encapsulation;

public class Student1Test {
	public class Main {
	    public static void main(String[] args) {
	        Student1 s = new Student1(1, "Kartik", 88.5);

	        // Access via getter
	        System.out.println("Name: " + s.getName());
	        System.out.println("Marks: " + s.getMarks());

	        // Modify using setter
	        s.setMarks(92.3);
	        System.out.println("Updated Marks: " + s.getMarks());
	    }
	}
}
