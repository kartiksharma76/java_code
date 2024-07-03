package controlflow;

public class Eligible {
	public static void main(String[] args) {
		int CGPA = 60;
		// class tenth 50<class tenth>=60
		// class twelth 55>class twelth<=60
		// graduation above to 60
		if (CGPA > 50 && CGPA <= 60) {
			System.out.println("class tenth");

		}

		else if (CGPA > 55 && CGPA <= 60) {
			System.out.println("class twelth");

		}

		else if (CGPA > 60) {
			System.out.println("graduation");
		}
	}
}
