package DeadLockConcepts;

public class DeadLock1 {
public void methodA() {
	synchronized (String.class) {
		System.out.println(Thread.currentThread().getName()+"String.class");
		synchronized (Integer.class) {
			System.out.println(Thread.currentThread().getName()+"lock Integer.class");
			
			
		}
		
	}
}
public void methodB() {
	synchronized (String.class) {
		System.out.println(Thread.currentThread().getName()+"lock Integer.class");
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName()+"String.class");
			
		}
		
	}
}
public static void main(String[] args) {
	DeadLock lock=new DeadLock();
	Thread t1=new Thread(()->lock.methodA(),"thread-1");
	Thread t2=new Thread(()->lock.methodB(),"thread-1");
	t1.start();
	t2.start();
	
}
}
