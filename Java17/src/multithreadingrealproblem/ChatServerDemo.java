package multithreadingrealproblem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatServer {

	private final ConcurrentHashMap<String, String> clients = new ConcurrentHashMap<>();

	public void connect(String name) {

		clients.put(name, name);

		System.out.println(name + " connected.");
	}

	public void disconnect(String name) {

		clients.remove(name);

		System.out.println(name + " disconnected.");
	}

	public void broadcast(String sender, String message) {

		System.out.println("\n" + sender + " : " + message);

		System.out.println("Broadcasting...");

		for (String client : clients.keySet()) {

			if (!client.equals(sender)) {

				System.out.println(client + " received : " + message);
			}
		}
	}
}

class ClientTask implements Runnable {

	private final ChatServer server;
	private final String clientName;
	private final String message;

	public ClientTask(ChatServer server, String clientName, String message) {

		this.server = server;
		this.clientName = clientName;
		this.message = message;
	}

	@Override
	public void run() {

		server.connect(clientName);

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}

		server.broadcast(clientName, message);

		server.disconnect(clientName);
	}
}

public class ChatServerDemo {

	public static void main(String[] args) throws InterruptedException {

		ChatServer server = new ChatServer();

		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.execute(new ClientTask(server, "Client-1", "Hello Everyone!"));

		executor.execute(new ClientTask(server, "Client-2", "Hi Guys!"));

		executor.execute(new ClientTask(server, "Client-3", "Good Morning!"));

		executor.shutdown();
	}
}