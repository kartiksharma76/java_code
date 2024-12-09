package MyInheritance;
// benefits of interface
//1.flexibility
//2.Code reusability
public class Twinkle implements Dancable,Speakable {

	@Override
	public void myDance() {
		System.out.println("Twinkle dance");
		
	}

	public static void main(String[] args) {
		Twinkle t=new Twinkle();
		t.bollywoodDance();
		t.mySpeak();
	}
    
}
