package StreamAPI;
/**
 * 1. by using comparable
 * 2. by using comparator
 * 3. by using lambda expression
 * 4. by using stream API
 * 
 */

import java.util.Comparator;

public class SortingConcepts {
	//Student student =new Student();simple constructor
	//Student student= new Student(){}; Anonymous class

public static Comparator<Student> sortByCgpa= new Comparator<>() {
	
	@Override
	public int compare(Student s1, Student s2) {
		int cgpa1 = (int) s1.getCGPA();
		int cgpa2 = (int) s2.getCGPA();
	int diff= (cgpa1-cgpa2);
	if(diff==0) {
	return	s1.getName().compareTo(s2.getName());
	}
		
		
		return (cgpa1-cgpa2);
	}
};
public static Comparator<Student> sortByUsinglambda = (s1, s2) -> {
	int cgpa1 = (int) s1.getCGPA();
	int cgpa2 = (int) s2.getCGPA();
	int diff = (cgpa1 - cgpa2);
	if (diff == 0) {
		return s1.getName().compareTo(s2.getName());
	}

	return (cgpa1 - cgpa2);

};
}
