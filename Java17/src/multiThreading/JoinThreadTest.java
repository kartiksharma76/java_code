package multiThreading;

public class JoinThreadTest {
public static void main(String[] args) throws InterruptedException {
	JoinThread jointhread=new JoinThread();
	jointhread.start();
	jointhread.join();
	String name=Thread.currentThread().getName();
	if("main".equalsIgnoreCase(name)) {
		System.out.println(name);
		//Thread.currentThread().join(1000);
				//Thread.sleep(1000);
				for(int i=1;i<=50;i++) {
					System.out.println("I am main thread");
	}
				//joinThread.join();
}
}
}