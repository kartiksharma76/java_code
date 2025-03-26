package multiThreading;

public class RunnableDemo {
public static void main(String[] args) {
	 EvenThread1 eventhread1=new EvenThread1();
	 OddThread1 oddthread1=new OddThread1();
	 Thread t1=new Thread(oddthread1, "Oddthread1 ");
	 Thread t2=new Thread(eventhread1, "eventhread1");
	 t1.start();
	 t2.start();
	 
}
}
