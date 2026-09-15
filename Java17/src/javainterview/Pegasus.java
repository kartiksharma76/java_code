package javainterview;

public class Pegasus extends Horse implements Flyer, Mythical {
	public static void main(String... args) {
		Pegasus myApp = new Pegasus();
		System.out.println(myApp.identifyMyself());
	}
}
