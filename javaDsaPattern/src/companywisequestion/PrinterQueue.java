package companywisequestion;

//Question:
//Printer system me print jobs FIFO order me execute karni hain.

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

	public static void main(String[] args) {

		Queue<String> printer = new LinkedList<>();

		printer.offer("Document1");
		printer.offer("Document2");
		printer.offer("Document3");

		while (!printer.isEmpty()) {
			System.out.println("Printing: " + printer.poll());
		}
	}
}
