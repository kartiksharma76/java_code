package MathsQuestion;

public class LanguageSpeakers {
	public static void main(String[] args) {
		int totalSpeakers = 100;
		int EnglishSpeakers = 72;
		int FrenchSpeakers = 43;

		// Calculate the maximum number of people who can speak both languages
		int MaxBothLanguage = Math.min(EnglishSpeakers, FrenchSpeakers);

		// Calculate the number of people who can speak English only
		int EnglishOnly = EnglishSpeakers - MaxBothLanguage;

		// Calculate the number of people who can speak French only
		int FrenchOnly = FrenchSpeakers - MaxBothLanguage;

		System.out.println("no of people who speakEnglish Only:" + EnglishOnly);
		System.out.println("no of people who speakFrench Only:" + FrenchOnly);
		System.out.println("no of people who speak Both English and French:" + MaxBothLanguage);
	}
}
/**
 * Let A be the set of people who speak English. B be the set of people who
 * speak French. A - B be the set of people who speak English and not French. B
 * - A be the set of people who speak French and not English. A ∩ B be the set
 * of people who speak both French and English.
 **/