package MathsQuestion;

public class StudentGame {
	public static void main(String[] args) {
		// total no of student
		int totalStudent = 40;
		// no of student playing each game
		int ChessPlayer = 18;
		int ScrabblePlayer = 20;
		int CarromPlayer = 27;

		// Number of students playing combinations of games
		int ChessScrabble = 7;
		int ScrabbleCarrom = 12;
		int ChessScrabbleCarrom = 4;
		// Calculate the number of students playing chess and carrom
		int ChessCarrom = ChessPlayer + CarromPlayer - totalStudent + ScrabbleCarrom - ChessScrabbleCarrom;
		// Calculate the number of students playing chess, carrom but not scrabble
		int ChessCarromNotScrabble = ChessCarrom - ChessScrabbleCarrom;

		System.out.println("No of student Playing Chess Carrom:" + ChessCarrom);
		System.out.println("No of student playing chess carrom but Not Scrabble:" + ChessCarromNotScrabble);
	}
}
