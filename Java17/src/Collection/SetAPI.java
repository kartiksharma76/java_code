package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//public abstract int size();
//public abstract boolean isEmpty();
//public abstract boolean contains(java.lang.Object);
//public abstract java.util.Iterator<E> iterator();
//public abstract java.lang.Object[] toArray();
//public abstract <T> T[] toArray(T[]);
//public abstract boolean add(E);
//public abstract boolean remove(java.lang.Object);
//public abstract boolean containsAll(java.util.Collection<?>);
//public abstract boolean addAll(java.util.Collection<? extends E>);
//public abstract boolean retainAll(java.util.Collection<?>);
//public abstract boolean removeAll(java.util.Collection<?>);
//public abstract void clear();// 
//public abstract boolean equals(java.lang.Object);
//public abstract int hashCode();
//public default java.util.Spliterator<E> spliterator();
public class SetAPI {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("kartik");
		set.add("prince");
		set.add("twinkle");
		set.add("kartik"); 
		
		System.out.println(" public abstract int size()");
		System.out.println(set.size());// 3
		
		System.out.println(" public abstract boolean isEmpty();");
		System.out.println(set.isEmpty());// false
		
		System.out.println("contain:");
		System.out.println(set.contains("Kundan"));// false
		
		System.out.println("iterator:");
		System.out.print("Iterating: ");// Iterating: twinkle kartik prince
		set.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("to array:");
		Object[] array = set.toArray();// [twinkle, kartik, prince]
		
		System.out.println(Arrays.toString(array));
		System.out.println(" toArray(T[]):");
		
		String[] arr = set.toArray(new String[1]);// [twinkle, kartik, prince]
		System.out.println(Arrays.toString(arr));
		
		System.out.println("add:");
		set.add("Keertan");// [twinkle, kartik, Keertan, prince]
		
		System.out.println(set);
		System.out.println("remove:");
		
		set.remove("Kundan");
		System.out.println(set);// [twinkle, kartik, Keertan, prince]
		
		System.out.println("contain all:");
		Set<String> set1 = new HashSet<>(Arrays.asList("ishu", "aman"));// [twinkle, kartik, Keertan, prince]
		
		System.out.println(set.containsAll(set1));
		System.out.println("addall:");
		
		set.addAll(Arrays.asList("ankit", "vivek"));// false
		System.out.println(set);
		
		System.out.println("retainall:");
		set.retainAll(set1);// []
		
		System.out.println(set);
		System.out.println("remove all:");
		
		set.removeAll(set1);// []
		System.out.println(set);
		
		System.out.println("clear:");
		set.clear();// true
		
		System.out.println(set.isEmpty());
		System.out.println("contain:");// true
		
		Set<String> anotherSet = new HashSet<>(Arrays.asList("ishu", "aman"));
		System.out.println(set1.equals(anotherSet));
		
		System.out.println("splite:");// karan harsh naman
		Set<String> splitSet = new HashSet<>(Arrays.asList("karan", "naman", "Harsh"));
		splitSet.spliterator().forEachRemaining(System.out::println);
	}
}
