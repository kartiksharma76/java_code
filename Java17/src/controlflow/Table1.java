package controlflow;

public class Table1 {
	public static void main(String[] args) {
		for (int table = 1; table <= 10; table++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(table + "*" + (i) + "=" + (table * (i)));
			}
		}
	}
}
