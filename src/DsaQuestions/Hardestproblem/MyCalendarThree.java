package DsaQuestions.Hardestproblem;


import java.util.*;

public class MyCalendarThree {

    private final TreeMap<Integer, Integer> events = new TreeMap<>();

    public static void main(String[] args) {
        MyCalendarThree calendar = new MyCalendarThree();

        System.out.println(calendar.book(10, 20)); // 1
        System.out.println(calendar.book(50, 60)); // 1
        System.out.println(calendar.book(10, 40)); // 2
        System.out.println(calendar.book(5, 15));  // 3
        System.out.println(calendar.book(5, 10));  // 3
        System.out.println(calendar.book(25, 55)); // 3
    }

    public int book(int start, int end) {
        events.merge(start, 1, Integer::sum);
        events.merge(end, -1, Integer::sum);

        int active = 0;
        int maximum = 0;

        for (int delta : events.values()) {
            active += delta;
            maximum = Math.max(maximum, active);
        }

        return maximum;
    }
}
