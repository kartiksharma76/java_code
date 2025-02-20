package StreamAPI;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student>{
private int id;
private String name;
private String branch;
private String college;
private double CGPA;

public Student() {
	
}
public Student(int id, String name, String branch, String college, double cGPA) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.college = college;
	CGPA = cGPA;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getBranch() {
	return branch;
}
public String getCollege() {
	return college;
}
public double getCGPA() {
	return CGPA;
}


//@Override
//public int compareTo(Student s) {
//	return Double.compare(this.CGPA,s.getCGPA());
//	
//}
@Override
public int compare(Student s1, Student s2) {
		return Double.compare(s1.getCGPA(),s2.getCGPA());
}



}
