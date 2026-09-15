package multiThreading;

public class ThreadTest {
public static void main(String[] args) {
//	Thread th=new ThreadExample();
	//th.start();
//	th.run();// it is a normal method invocation/call
	ThreadExample th2=new ThreadExample();
	//th2.printoddNumber();
	th2.start();
	for(int i=1;i<=10;i++) {
		System.out.println("main thread");
	}

}
}
