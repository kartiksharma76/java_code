package Collections;

import java.util.ArrayList;

public class ArrayListTraversalEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Aman");
        names.add("Kartik");

        for (int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        for(String name : names){
            System.out.println(name);
        }
    }
}
