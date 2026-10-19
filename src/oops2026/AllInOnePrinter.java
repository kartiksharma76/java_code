package oops2026;

public class AllInOnePrinter implements Printable,Scannable{
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}
