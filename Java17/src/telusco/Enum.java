package telusco;

enum Status {
	running, Failed, Pending, Success
}

public class Enum {
	public static void main(String[] args) {
		int i = 5;
//	Status s = Status.running;
//	Status s= Status.Failed;
//	Status s= Status.NoIdea;
//	Status s= Status.Success;
//	System.out.println(s.ordinal());
//System.out.println(s);

		Status[] ss = Status.values();
		System.out.println(ss);
		for (Status s : ss) {
			System.out.println(s);
			System.out.println(s + " :" + s.ordinal());
		}
	}
}
