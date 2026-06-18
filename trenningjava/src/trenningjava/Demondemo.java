package trenningjava;

public class Demondemo extends Thread {
	private int limit;

	public Demondemo(int limit, String name) {
		super(name);
		this.limit = limit;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		for (int c = 1; c <= limit; c++)
			System.out.println(name + ": " + c);
	}

	public static void main(String[] args) {
		Demondemo d1 = new Demondemo(25, "First");
		Demondemo d2 = new Demondemo(50, "Second");
		Demondemo d3 = new Demondemo(100, "Third");
		Demondemo d4 = new Demondemo(50000, "Forth");
		d4.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}
