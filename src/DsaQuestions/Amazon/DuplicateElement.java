package DsaQuestions.Amazon;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[]arr = {1,2,3,2,4,1,5};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();
        for (int num : arr){
            if (!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}
