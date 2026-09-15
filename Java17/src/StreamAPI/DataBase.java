package StreamAPI;
//1. fetch all the student of IT branch
//2. fetch all the students of SIRT college
//3. fetch distinct branches
//4. fetch those students having CGPA >8.5
//5. sort all the students by CGPA(in ascending and Descending order)
import java.util.ArrayList;
import java.util.List;
//public Student(int id, String name, String branch, String college, double cGPA) 
public class DataBase {
public static List<Student> getData(){
	List<Student> list= new ArrayList<>();
	list.add(new Student(5, "riya", "ME", "LNCT", 7.7));
	list.add(new Student(1, "kartik1", "IT", "SIRT", 7.24));
//	list.add(new Student(1, "kartik", "IT", "SIRT", 7.24));
	list.add(new Student(2, "prince", "CSE", "Galgotiya", 8.2));
	list.add(new Student(3, "twinkle", "CSE", "SIRT", 9.3));
	list.add(new Student(4, "rikita2", "IT", "LNCT", 8.7));

	return list;
}
//1.sort employee by their salary if salary matches then sort by  names
// using Comparator technique and streamAPI
public static List<Employee> getEmployeeData(){
	List<Employee> list= new ArrayList<>();
	list.add(new Employee(10, "Riya", "TCS", 25000));
	list.add(new Employee(50, "Prince", "Accenture", 30000));
	list.add(new Employee(30, "Twinkle", "TCS", 35000));
	list.add(new Employee(40, "Kartik", "TCS", 25000));
	list.add(new Employee(20, "Ritika", "Accenture", 40000));
	return list;
}
//sort using Comparable technique and streamAPI
public static List<Employee2> getEmployee2Data(){
	List<Employee2> list= new ArrayList<>();
	list.add(new Employee2(10, "Riya", "TCS", 25000));
	list.add(new Employee2(50, "Prince", "Accenture", 30000));
	list.add(new Employee2(30, "Twinkle", "TCS", 35000));
	list.add(new Employee2(40, "Kartik", "TCS", 25000));
	list.add(new Employee2(20, "Ritika", "Accenture", 40000));
	return list;
}
}
