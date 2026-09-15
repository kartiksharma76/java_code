package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//1. fetch all the student of IT branch
//2. fetch all the students of SIRT college
//3. fetch distinct branches
//4. fetch those students having CGPA >8.5
//5. sort all the students by CGPA(in ascending and Descending order)
public class StreamApiPractice {
public static void main(String[] args) {
	List<Student> list = DataBase.getData();
// traditional approach
	List<Student> itStudents = new ArrayList<>();
	for(Student s :list) {
		if("IT".equalsIgnoreCase(s.getBranch())) {
			itStudents.add(s);
		}
	//	if(s.getBranch().equalsIgnoreCase("IT")) valid syntax but not recommended
	}
	System.out.println("fetch all the student of IT branch");
	for(Student s:itStudents) {
		System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA());
	}
	System.out.println(" fetch all the students of SIRT college");
	List<Student> sirtStudents=new ArrayList<>();
	for(Student s:list) {
		if("SIRT".equalsIgnoreCase(s.getCollege())) {
			sirtStudents.add(s);
		}
	}
	for(Student s:sirtStudents) {
		System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA());
	}
	System.out.println(" fetch distinct branches");
	// list allows duplicate elements but set does not allow duplicate element
	Set<String> branchList=new HashSet<>();
	 for(Student s:list) {
		branchList.add(s.getBranch());
	 }
	 for(String branch:branchList) {
		 System.out.println(branch);
	 }
	 System.out.println("fetch those students having CGPA >8.5");
	 List<Student> cgpa =new ArrayList<>();
	 for(Student s: list) {
		 if(s.getCGPA()>8.5) {
			 cgpa.add(s);
		 }
	 }
	 for(Student s:cgpa) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA());
		}
	 System.out.println("sort all the students by CGPA(in ascending and Descending order)");
//	 Set<Student> cgpaSet= new TreeSet<>(); twinkle didi did blunder mistake
	Collections.sort(list, SortingConcepts.sortByCgpa);
	// list.sort(new Student());
//	 Comparator<? super E> c
	 //	Arrays.so
	System.out.println("***********");
	 Set<Student> set= new TreeSet<>(list);// this is not a good approach to sort list,because list might contain
	 //duplicate elements align with business need.
	 for(Student s:set) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA());
		}
}
}
