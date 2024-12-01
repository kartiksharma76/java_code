package MathsQuestion;

public class MedalDistributations {
	public static void main(String[] args) {
		int totalMedals = 66;
		int totalPerson = 45;
		int allThreeCatagories = 4;

		int ExactlyTwoCatagories = totalMedals - totalPerson - allThreeCatagories;
		System.out.println("No of person Who receive the Medals in Exactly Two Catagories:" + ExactlyTwoCatagories);
	}
}
/**This code first calculates the total number of medals awarded.
Then, it subtracts the total number of persons who received medals from the total number of medals to find
the extra medals awarded
Finally, it subtracts the number of medals awarded to persons in all three categories to get the number of medals awarded
awarded to persons in all three categories to get the number of medals awarded to persons in exactly two categories.**/