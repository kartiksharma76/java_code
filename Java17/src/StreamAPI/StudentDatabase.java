package StreamAPI;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

	public static List<Student2> getStudents2() {

		List<Student2> studentList = new ArrayList<>();

		studentList.add(new Student2(101, "Shail", LocalDate.of(2004, Month.AUGUST, 1), "Female", "Single",
				LocalDate.of(2023, Month.DECEMBER, 15), "Computer Science", "B.Tech CSE", 240000, "Bangalore"));

		studentList.add(new Student2(102, "Ambe", LocalDate.of(2003, Month.FEBRUARY, 12), "Female", "Single",
				LocalDate.of(2022, Month.APRIL, 21), "Computer Science", "B.Tech CSE", 240000, "Delhi"));

		studentList.add(new Student2(103, "Ram", LocalDate.of(2002, Month.JULY, 15), "Male", "Married",
				LocalDate.of(2021, Month.JULY, 27), "Humanities", "MBA HR", 140000, "Delhi"));

		studentList.add(new Student2(104, "Santosh", LocalDate.of(2002, Month.JULY, 15), "Male", "Married",
				LocalDate.of(2021, Month.JULY, 27), "Humanities", "MBA HR", 100000, "Chennai"));

		studentList.add(new Student2(105, "Mahendra", LocalDate.of(2001, Month.MARCH, 20), "Male", "Married",
				LocalDate.of(2019, Month.AUGUST, 27), "Information Technology", "B.Tech IT", 500000, "Bangalore"));

		studentList.add(new Student2(106, "Anjali", LocalDate.of(2003, Month.AUGUST, 15), "Female", "Single",
				LocalDate.of(2021, Month.JULY, 27), "Computer Science", "B.Tech CSE", 240000, "Pune"));

		studentList.add(new Student2(107, "Anu", LocalDate.of(2003, Month.MARCH, 7), "Female", "Single",
				LocalDate.of(2021, Month.JULY, 27), "Computer Science", "B.Tech Python", 240000, "Pune"));

		studentList.add(new Student2(108, "Sanjay", LocalDate.of(2000, Month.MAY, 17), "Male", "Married",
				LocalDate.of(2020, Month.JANUARY, 17), "Finance", "MBA Finance", 700000, "Mumbai"));

		studentList.add(new Student2(109, "Ujjwal", LocalDate.of(2001, Month.NOVEMBER, 29), "Male", "Single",
				LocalDate.of(2020, Month.DECEMBER, 27), "Finance", "BBA", 550000, "Kolkata"));

		studentList.add(new Student2(110, "Tulsi", LocalDate.of(2001, Month.MARCH, 20), "Male", "Married",
				LocalDate.of(2017, Month.JULY, 13), "IT", "MCA", 500000, "Bangalore"));

		studentList.add(new Student2(111, "Shraddha", LocalDate.of(2003, Month.JULY, 3), "Female", "Single",
				LocalDate.of(2021, Month.SEPTEMBER, 8), "IT", "B.Tech Full Stack", 300000, "Delhi"));

		studentList.add(new Student2(112, "Raj", LocalDate.of(2000, Month.JULY, 15), "Male", "Married",
				LocalDate.of(2019, Month.JULY, 7), "Marketing", "MBA Digital Marketing", 1000000, "Mumbai"));

		studentList.add(new Student2(113, "Deepika", LocalDate.of(1999, Month.JULY, 15), "Female", "Married",
				LocalDate.of(2018, Month.DECEMBER, 29), "Board of Studies", "PhD", 10000000, "Kolkata"));

		studentList.add(new Student2(114, "Rishi", LocalDate.of(2004, Month.DECEMBER, 2), "Male", "Single",
				LocalDate.of(2022, Month.MARCH, 15), "IT", "BCA", 50000, "Indore"));

		studentList.add(new Student2(115, "Palak", LocalDate.of(2004, Month.OCTOBER, 23), "Female", "Single",
				LocalDate.of(2022, Month.MARCH, 15), "IT", "BCA", 50000, "Indore"));

		studentList.add(new Student2(116, "Shiva", LocalDate.of(2003, Month.AUGUST, 1), "Male", "Single",
				LocalDate.of(2021, Month.JULY, 1), "Marketing", "BA Advertising", 400000, "Patna"));

		studentList.add(new Student2(117, "Govind", LocalDate.of(2002, Month.FEBRUARY, 24), "Male", "Single",
				LocalDate.of(2020, Month.JUNE, 17), "Production", "B.Tech Production", 400000, "Chennai"));

		studentList.add(new Student2(118, "Astuti", LocalDate.of(2003, Month.OCTOBER, 9), "Female", "Single",
				LocalDate.of(2021, Month.JULY, 6), "IT", "B.Tech Full Stack", 300000, "Hyderabad"));

		studentList.add(new Student2(119, "Krishna", LocalDate.of(2002, Month.MAY, 29), "Male", "Single",
				LocalDate.of(2021, Month.JULY, 1), "IT", "M.Tech AI", 1000000, "Bangalore"));

		studentList.add(new Student2(120, "Govind", LocalDate.of(2002, Month.MAY, 24), "Male", "Married",
				LocalDate.of(2021, Month.JULY, 1), "Marketing", "MBA Marketing", 1000000, "Hyderabad"));

		return studentList;
	}
}
