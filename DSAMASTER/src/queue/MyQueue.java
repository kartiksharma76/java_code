package queue;

/**
 * Minimal queue contract implemented by each "Implement Queue using ..." class.
 */
public interface MyQueue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}
