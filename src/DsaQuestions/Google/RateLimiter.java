package DsaQuestions.Google;

import java.util.LinkedList;
import java.util.Queue;

public class RateLimiter {
    private final int maxRequests;
    private final long windowMillis;

    private Queue<Long> requests = new LinkedList<>();

    public RateLimiter(int maxRequests, long windowSecond) {
        this.maxRequests = maxRequests;
        this.windowMillis = windowSecond * 1000L;
    }

    public boolean allowRequest() {
        long currentTime = System.currentTimeMillis();

        while (!requests.isEmpty() && currentTime - requests.peek() >= windowMillis) {

            requests.poll();
        }

        if (requests.size() >= maxRequests) {
            return false;
        }
        requests.offer(currentTime);
        return true;
    }

    public static void main(String[] args) {
        RateLimiter limiter = new RateLimiter(3, 10);

        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest());
    }
}
