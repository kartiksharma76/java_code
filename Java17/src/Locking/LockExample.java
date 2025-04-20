package Locking;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	public static void main(String[] args) {
 //Condition lock=Lock.newCondition();
 ReentrantLock lock= new ReentrantLock();
System.out.println(lock.getHoldCount());
//System.out.println(lock.getQueueLength());
//System.out.println(lock.isLocked());
//System.out.println(lock.tryLock());
//System.out.println(lock.isFair());
//System.out.println(lock.getQueueLength());
//System.out.println(lock.isHeldByCurrentThread());
//System.out.println(lock.getWaitQueueLength(null));
//System.out.println(lock.getHoldCount());
//System.out.println();

 
}
}