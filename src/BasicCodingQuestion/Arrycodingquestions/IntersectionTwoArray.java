
package BasicCodingQuestion.Arrycodingquestions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionTwoArray {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4};
        Integer[] b = {3, 4, 5, 6};

        // Union of two arrays
        Set<Integer> union = new TreeSet<>(Arrays.asList(a));
        union.addAll(Arrays.asList(b));

        // Intersection of two arrays
        Set<Integer> inter = new TreeSet<>(Arrays.asList(a));
        inter.retainAll(Arrays.asList(b));

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }
}
