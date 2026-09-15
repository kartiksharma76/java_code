package multithreadingrealproblem;

import java.util.concurrent.*;

class URLCrawler {

	private final ConcurrentLinkedQueue<String> urlQueue = new ConcurrentLinkedQueue<>();

	private final ConcurrentHashMap<String, Boolean> visited = new ConcurrentHashMap<>();

	public void addUrl(String url) {
		urlQueue.offer(url);
	}

	public void crawl() {

		while (true) {

			String url = urlQueue.poll();

			if (url == null)
				break;

			if (visited.putIfAbsent(url, true) == null) {

				System.out.println(Thread.currentThread().getName() + " crawling " + url);

				try {

					Thread.sleep(2000);

				} catch (InterruptedException e) {

					Thread.currentThread().interrupt();
				}

			} else {

				System.out.println("Duplicate URL ignored : " + url);
			}
		}
	}
}

public class URLCrawlerDemo {

	public static void main(String[] args) throws InterruptedException {

		URLCrawler crawler = new URLCrawler();

		crawler.addUrl("https://google.com");
		crawler.addUrl("https://github.com");
		crawler.addUrl("https://openai.com");
		crawler.addUrl("https://oracle.com");
		crawler.addUrl("https://google.com");
		crawler.addUrl("https://github.com");

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {

			executor.execute(crawler::crawl);
		}

		executor.shutdown();

		executor.awaitTermination(1, TimeUnit.MINUTES);

		System.out.println("\nCrawling Finished.");
	}
}