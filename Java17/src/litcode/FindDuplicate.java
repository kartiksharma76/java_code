package litcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
public static void main(String[] args) {
	  int[] arr = {1, 2, 3, 2, 4, 1, 5};
      Set<Integer> seen = new HashSet<>();
      Set<Integer> dup = new HashSet<>();
      for (int n : arr) {
          if (!seen.add(n))
              dup.add(n);
      }

      System.out.println("Duplicates: " + dup);
}
}
