package multiThreading;

public class CurrentThread {
	/**
	 * Step 1: Program Start Hota Hai
	 * 
	 * Jab JVM program ko run karti hai, to wo automatically ek thread create karti
	 * hai jiska naam hota hai main thread.
	 * 
	 * 
	 * step 2: Thread.currentThread() Thread t = Thread.currentThread(); Ye static
	 * method hai Thread class ka. Ye method currently execute ho rahe thread ka
	 * reference return karta hai. Abhi main() method main thread me chal rahi hai.
	 * 
	 * 
	 * 
	 * step 3: System.out.println(t); System.out.println(t) Yaha object print ho
	 * raha hai. Jab kisi thread object ko print karte hain, internally uska
	 * toString() method call hota hai. Thread class ka toString() kuch aisa return
	 * karta hai: Thread[ThreadName,Priority,ThreadGroup]
	 * 
	 * 
	 * currentThread() Kya Karta Hai?
	 * 
	 * Jo thread is waqt code execute kar raha hai uska reference return karta
	 * hai.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
