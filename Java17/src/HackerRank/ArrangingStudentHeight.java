package HackerRank;
/**
 * Imagine 8 student standing in a line raondomly
 * [3,5,6,2,4,6,8,6](the number represent height in some utils)
 * my goal : Arrange them from the shortest to tallest
 * you do this repeatdly comparing two adjecent student and swapping them 
 * of the one of the left is taller
 * This exately what Bubble Sort does.
 * 
 * how to work code 
 * 1. round ( i =0)means adjecent pair
 * ex- 
 * compare 3 and 5 -> ok
 * compare 5 and 6 -> ok
 * compare 6 and 2 -> wrong swap(because 6 > 2)
 * line because [3,5,2,6,4,6,8,6]
 * This is contineous until the end 
 * At the end of Round 1->The tallest person reach position 
 * 
 * ROUND-2(i =1)
 * Now ignore the last position (already stored)
 * Again compare and swap 
 * slowly, the next taklest will go to second last position 
 *  
 *  
 *  ROUND 3,4,5
 *  As round continue ->smaller student bubble towards the start taller ones settle at the end  of completly sortrd
 * 
 * 
 * imagine washing machine bubble 
 * Big bubble rise to the top first -> similar to how big number move to the end first. 
 * 
 * 
 * if(arr[j]> arr[j+1]){
 * int temp = arr[j];
 * arr[j] = arr[j+1];
 * arr[j+1] = temp;
 * }
 * 
 * for(int i =0; i<n-i;i++)
 * 
 * 
 */
public class ArrangingStudentHeight {

	// This method arranges students by height in ascending order
	public void arrangementOfHeight(int[] heights) {

		int n = heights.length;

		// Each round = the teacher checks the line one more time
		for (int round = 0; round < n - 1; round++) {

			// Checking each pair of students standing side-by-side
			for (int position = 0; position < n - round - 1; position++) {

				// If left student is taller than the next student → swap them
				// (They exchange their positions in the line)
				if (heights[position] > heights[position + 1]) {
					int temp = heights[position];
					heights[position] = heights[position + 1];
					heights[position + 1] = temp;
				}
			}
		}
	}

	// Printing the final arranged heights of students
	void printHeight(int[] heights) {
		for (int hei : heights) {
			System.out.print(hei + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Heights of students standing in a random order
		int[] studentHeights = { 3, 5, 6, 2, 4, 6, 8, 6 };

		ArrangingStudentHeight sort = new ArrangingStudentHeight();

		System.out.println("Arranging Students by height...");

		// Teacher tells the students to stand in increasing order of height
		sort.arrangementOfHeight(studentHeights);

		System.out.println("Students arranged by height (ascending):");
		sort.printHeight(studentHeights);
	}

}

