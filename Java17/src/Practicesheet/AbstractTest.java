package Practicesheet;

public class AbstractTest {
public static void main(String[] args) {
	Employee1 emp1 = new FullTimeEmployee("KartikeySharma", 101, 5000.0);
	Employee1 emp2 = new PartTimeEmployee("Keertan", 102, 20.0, 80);

	emp1.displayInfo();
	System.out.println("Salary: $" + emp1.calculateSalary());

	emp2.displayInfo();
	System.out.println("Salary: $" + emp2.calculateSalary());
}
}
