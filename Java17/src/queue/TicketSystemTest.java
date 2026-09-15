package queue;

public class TicketSystemTest {
	public static void main(String[] args) {
		TicketingSystem system = new TicketingSystem();
		system.addVisitor("regular", "alice");
		system.addVisitor("vip", "bob");
		system.addVisitor("Regular", "charlie");
		String ticket = system.issueTicket();
		system.addVisitor("vip", "dana");
		String ticket1 = system.issueTicket();
		String ticket2 = system.issueTicket();

		System.out.println("ticket:" + ticket);
		System.out.println("ticket1:" + ticket1);
		System.out.println("ticket2:" + ticket2);

		System.out.println("total visitors waiting:" + system.queueSize());

	}
}
