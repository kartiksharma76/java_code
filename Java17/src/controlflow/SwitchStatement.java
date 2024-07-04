package controlflow;

public class SwitchStatement {
	public static void main(String[] args) {
		String name = "tulsi";
		//ice bss(int,char,enum,byte,short,string)
		switch (name) {
		case "kundan": {
			System.out.println("kundan");
			break;
		}
		case "prince":
			System.out.println("prince");
			break;
		case "mohan":
			System.out.println("mohan");
			break;
		case "alok":
			System.out.println("alok");
			break;
		case "kartik":
			System.out.println("kartik");
			break;
		default:
			System.out.println("joker");
		}
	}
}
