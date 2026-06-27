package companywisequestion;

import java.util.PriorityQueue;

class Patient {
	String name;
	int priority;

	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
}

public class HospitalPriority {
	public static void main(String[] args) {
		PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.priority - a.priority);

		pq.offer(new Patient("Ram", 2));
		pq.offer(new Patient("Shyam", 5));
		pq.offer(new Patient("Amit", 3));

		while (!pq.isEmpty()) {
			Patient p = pq.poll();

			System.out.println(p.name + " Priority=" + p.priority);

		}

	}
}
