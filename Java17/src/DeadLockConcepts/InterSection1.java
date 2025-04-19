package DeadLockConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterSection1 {
private Object RoadA =new Object();
private Object RoadB =new Object();
 
public void takeRoadA() {
	synchronized (RoadA) {
		System.out.println("road A is locked by " + Thread.currentThread().getName());
		synchronized (RoadB) {
			System.out.println("train is passing through road A ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public void takeRoadB() {
	synchronized (RoadA) {
		System.out.println("road B is locked by " + Thread.currentThread().getName());
		synchronized (RoadB) {
			System.out.println("train is passing through road B ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public static void main(String[] args) {
ExecutorService service	=Executors.newFixedThreadPool(2);
InterSection1 interSection =new InterSection1();
Runnable trainA=()->{
	while(true) {
	interSection.takeRoadA();
	}
};
Runnable trainB=()->{
	while(true) {
	interSection.takeRoadB();
	}
};
service.submit(trainA);
service.submit(trainB);
}
}
