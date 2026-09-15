package infosyscodingquestion;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
	public static void main(String[] args) {
		// Define Activity(start, finish)

		Activity activities[] = { new Activity(1, 2), new Activity(3, 4), new Activity(0, 6), new Activity(5, 7),
				new Activity(8, 9), new Activity(5, 9) };
// soft activites by finsih time(accending)
		Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

//Select first Activites
		System.out.println("Selected Activites");
		System.out.println("(" + activities[0].start + ", " + activities[0].finish + ")");
		int lastfinish = activities[0].finish;

// Traverse remaining activites
		for (int i = 1; i < activities.length; i++) {

// if start time  >= last selected finish time
			if (activities[i].start >= lastfinish) {

// if selected
				System.out.println("(" + activities[i].start + ", " + activities[i].finish + ")");

// Update last finish
				lastfinish = activities[i].finish;
			}
		}
	}
}

class Activity {
	int start;
	int finish;

	Activity(int s, int f) {
		start = s;
		finish = f;

	}
}
