package telusco;

enum Status1 {
	Running, Failed, Pending, Success;
}

public class EnumIfAndSwitch {
	public static void main(String[] args) {
		Status1 s = Status1.Pending;
		switch (s) {
		case Running:
			System.out.println("All Good");
			break;

		case Failed:
			System.out.println("Try Again");
			break;

		case Pending:
			System.out.println("Please Wait");
			break;

		default:
			System.out.println("Done");
			break;
		}
		if (s == Status1.Running)
			System.out.println("All Good");
		else if (s == Status1.Failed)
			System.out.println("Try Again");
		else if (s == Status1.Pending)
			System.out.println("Please Wait");
		else
			System.out.println("Done");
	}
}
