package oops;

interface PrinterDevice {

	default void printStatus() {
		System.out.println("Printer Ready");
	}

	void printDocument();
}

class LaserPrinter implements PrinterDevice {

	@Override
	public void printDocument() {
		System.out.println("Printing Document");
	}
}

public class DefaultMethodExample {

	public static void main(String[] args) {

		LaserPrinter printer = new LaserPrinter();

		printer.printStatus();
		printer.printDocument();
	}
}