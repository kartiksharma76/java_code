package Java8Practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1234, "Shail", LocalDate.of(2001, Month.AUGUST, 1), "Female", "Single",
				LocalDate.of(2023, Month.DECEMBER, 15), "IT", "Java Developer", 24_00_000, "Bangalore"));
		empList.add(new Employee(1233, "Ambe", LocalDate.of(2000, Month.FEBRUARY, 12), "Female", "Single",
				LocalDate.of(2022, Month.APRIL, 21), "IT", "Python Developer", 24_00_000, "Delhi"));
		empList.add(new Employee(1244, "Ram", LocalDate.of(1998, Month.JULY, 15), "Male", "Married",
				LocalDate.of(2017, Month.JULY, 27), "HR", " Recruiter", 14_00_000, "Delhi"));
		empList.add(new Employee(1245, "Santosh", LocalDate.of(1998, Month.JULY, 15), "Male", "Married",
				LocalDate.of(2017, Month.JULY, 27), "HR", " HR assistant", 10_00_000, "Chennai"));
		empList.add(new Employee(1224, "Mahendra", LocalDate.of(1991, Month.MARCH, 20), "Male", "Married",
				LocalDate.of(2019, Month.AUGUST, 27), "IT", "Manager", 50_00_000, "Bangalore"));
		empList.add(new Employee(1344, "Anjali", LocalDate.of(1999, Month.AUGUST, 15), "Female", "Single",
				LocalDate.of(2021, Month.JULY, 27), "IT", "Java Developer", 24_00_000, "Pune"));
		empList.add(new Employee(9244, "Anu", LocalDate.of(2000, Month.MARCH, 7), "Female", "Singel",
				LocalDate.of(2021, Month.JULY, 27), "IT", " Python Developer", 24_00_000, "Pune"));
		empList.add(new Employee(6244, "Sanjay", LocalDate.of(1989, Month.MAY, 17), "Male", "Married",
				LocalDate.of(2000, Month.JANUARY, 17), "Finance", " Director", 70_00_000, "Mumbai"));
		empList.add(new Employee(1284, "Ujjwal", LocalDate.of(1995, Month.NOVEMBER, 29), "Male", "Single",
				LocalDate.of(2010, Month.DECEMBER, 27), "Finance", "Assistant Director", 55_00_000, "Kolkata"));
		empList.add(new Employee(1214, "Tulsi", LocalDate.of(1991, Month.MARCH, 20), "Male", "Married",
				LocalDate.of(2017, Month.JULY, 13), "IT", "Manager", 50_00_000, "Bangalore"));
		empList.add(new Employee(8244, "Shraddha", LocalDate.of(1999, Month.JULY, 3), "Female", "Single",
				LocalDate.of(2021, Month.SEPTEMBER, 8), "IT", "Full Stack Developer", 30_00_000, "Delhi"));
		empList.add(new Employee(7244, "Raj", LocalDate.of(1985, Month.JULY, 15), "Male", "Married",
				LocalDate.of(1999, Month.JULY, 7), "Marketing", "Chief Digital Officer", 1_00_00_000, "Mumbai"));
		empList.add(new Employee(1994, "Deepika", LocalDate.of(1994, Month.JULY, 15), "Female", "Married",
				LocalDate.of(2005, Month.DECEMBER, 29), "Board of Directors", "President", 1_00_00_00_000, "Kolkata"));
		empList.add(new Employee(1324, "Rishi", LocalDate.of(2001, Month.DECEMBER, 2), "Male", "Single",
				LocalDate.of(2022, Month.MARCH, 15), "IT", "System Engineer", 5_00_000, "Indore"));
		empList.add(new Employee(1255, "Palak", LocalDate.of(2001, Month.OCTOBER, 23), "Female", "Single",
				LocalDate.of(2022, Month.MARCH, 15), "IT", "System Engineer", 5_00_000, "Indore"));
		empList.add(new Employee(1240, "Shiva", LocalDate.of(2000, Month.AUGUST, 1), "Male", "Single",
				LocalDate.of(2021, Month.JULY, 1), "Marketing", "Content Writer", 40_00_000, "Patna"));
		empList.add(new Employee(1247, "Govind", LocalDate.of(1998, Month.FEBRUARY, 24), "Male", "Single",
				LocalDate.of(2015, Month.JUNE, 17), "Production", "Product Manager", 40_00_000, "Chennai"));
		empList.add(new Employee(8274, "Astuti", LocalDate.of(1999, Month.OCTOBER, 9), "Female", "Single",
				LocalDate.of(2021, Month.JULY, 6), "IT", "Full Stack Developer", 30_00_000, "Hyderabad"));
		empList.add(new Employee(7357, "Krishna", LocalDate.of(1998, Month.MAY, 29), "Male", "Single",
				LocalDate.of(2021, Month.JULY, 1), "IT", "Director", 1_00_00_000, "Bangalore"));
		empList.add(new Employee(7355, "Govind", LocalDate.of(1998, Month.MAY, 24), "Male", "Married",
				LocalDate.of(2021, Month.JULY, 1), "Marketing", "Director", 1_00_00_000, "Hyderabad"));
		return empList;

	}
}
