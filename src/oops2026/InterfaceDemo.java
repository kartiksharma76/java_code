package oops2026;

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable printer = new AllInOnePrinter();
        printer.print();

        Scannable scanner = (Scannable) printer;
        scanner.scan();
    }
}
