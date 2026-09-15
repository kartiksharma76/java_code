package multithreadingrealproblem;

import java.util.concurrent.locks.ReentrantLock;

class Hospital {
	private final ReentrantLock lock = new ReentrantLock();

	public void bookAppointment() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " is trying to book an appointment...");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " booked the appointment successfully.");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
		}
	}
}

public class HospitalBooking {
	public static void main(String[] args) throws InterruptedException {
		Hospital hospital = new Hospital();

		Thread p1 = new Thread(hospital::bookAppointment, "Patient-1");

		Thread p2 = new Thread(hospital::bookAppointment, "Patient-2");

		Thread p3 = new Thread(hospital::bookAppointment, "Patient-3");

		p1.start();
		p2.start();
		p3.start();

		p1.join();
		p2.join();
		p3.join();

		System.out.println("\nAll Appointments Completed.");
	}
}
