package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. fetch all the student of IT branch
//2. fetch all the students of SIRT college
//3. fetch distinct branches
//4. fetch those students having CGPA >8.5
//5. sort all the students by CGPA(in ascending and Descending order)
public class StreamAPIPractice1 {
	public static void main(String[] args) {
		List<Student> list = DataBase.getData();
		//difference between collection and stream
		List<Student> list1 = DataBase.getData();
		//1. fetch all the student of IT branch
		//To convert list to stream 
		Stream<Student> stream = list.stream();
	   // Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
		Predicate<Student> test= (t)->{
//		if("IT".equalsIgnoreCase(t.getBranch())) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return "IT".equalsIgnoreCase(t.getBranch());
		
		};
		Predicate<Student> test1= t->"IT".equalsIgnoreCase(t.getBranch());


		Stream<Student> filter = stream.filter(test1);   
	    //<R, A> R collect(Collector<? super T, A, R> collector);
		// Collector<T, ?, List<T>> toList() {
		List<Student> collect = filter.collect(Collectors.toList());
		//collect.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA()));
		//Predicate<Student> test2= t->"IT".equalsIgnoreCase(t.getBranch());

		//list.stream().filter(t->"IT".equalsIgnoreCase(t.getBranch())).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA()));
		//2. fetch all the students of SIRT college
		
		//list.stream().filter(t->"SIRT".equalsIgnoreCase(t.getCollege())).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA()));
		//3. fetch distinct branches
	    //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//R apply(T t);
		Function<Student, String> fun=f ->f.getBranch();

		//list.stream().map(f ->f.getBranch()).distinct().collect(Collectors.toList()).forEach(System.out::println);
		//4. fetch those students having CGPA >8.5
		list.stream().filter(s->s.getCGPA()>8.5 ).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA()));
		//5. sort all the students by CGPA(in ascending and Descending order)
	   // Stream<T> sorted(Comparator<? super T> comparator);
	   // int compare(T o1, T o2);
//		Comparator<Student> sortByCGPA=(s1,s2)->{
//			return Double.compare(s1.getCGPA(),s2.getCGPA());
//			
//		};
//
//		list.stream().sorted(sortByCGPA).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getCGPA()));
	}


}

