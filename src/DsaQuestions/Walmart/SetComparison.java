package DsaQuestions.Walmart;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {

    public static void main(String[] args) {

        // ---------------- HASHSET ----------------

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);   // Duplicate ignored

        System.out.println("HashSet:");
        System.out.println(hashSet);


        // --------------- LINKEDHASHSET ---------------

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);   // Duplicate ignored

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);


        // ---------------- TREESET ----------------

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);   // Duplicate ignored

        System.out.println("\nTreeSet:");
        System.out.println(treeSet);
    }
}