package queue;

import java.util.LinkedList;
import java.util.Queue;

class TicketingSystem {
	private Queue<String> regularQueue;
	private Queue<String> vipQueue;

	public TicketingSystem() {
		regularQueue = new LinkedList<>();
		vipQueue = new LinkedList<>();
	}

	public void addVisitor(String type, String name) {
		if (type.equals("VIP")) {
			vipQueue.add(name);
		} else {
			regularQueue.add(name);
		}
	}

	public String issueTicket() {
		if (!vipQueue.isEmpty()) {
			return vipQueue.poll();
		} else if (!regularQueue.isEmpty()) {
			return regularQueue.poll();
		} else {
			return null; // No visitors waiting
		}
	}

	public int queueSize() {
		return regularQueue.size() + vipQueue.size();
	}

}