package queue;

/**
 * Minimal stack contract implemented by StackUsingQueues.
 */
public interface MyStack<T> {
    void push(T item);
    T pop();
    T top();
    boolean isEmpty();
    int size();
}
