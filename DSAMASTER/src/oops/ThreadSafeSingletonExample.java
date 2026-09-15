package oops;

class CacheManager {

    private static CacheManager instance;

    private CacheManager() {
    }

    public static synchronized CacheManager getInstance() {

        if (instance == null) {
            instance = new CacheManager();
        }

        return instance;
    }
}

public class ThreadSafeSingletonExample {

    public static void main(String[] args) {

        CacheManager cache1 = CacheManager.getInstance();
        CacheManager cache2 = CacheManager.getInstance();

        System.out.println(cache1 == cache2);
    }
}