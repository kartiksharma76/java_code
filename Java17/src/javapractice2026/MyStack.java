package javapractice2026;

public class MyStack {

    int max = 5;
    int top = -1;
    int[] arr = new int[max];

    /*
     * ALGORITHM : PUSH (Insert)
     * 1. Agar top == max - 1 ho to Stack Overflow
     * 2. top = top + 1
     * 3. arr[top] = value
     */

    public void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed");
    }

    /*
     * ALGORITHM : POP (Delete)
     * 1. Agar top == -1 ho to Stack Underflow
     * 2. arr[top] delete karo
     * 3. top = top - 1
     */

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top] + " popped");
        top--;
    }

    /*
     * ALGORITHM : PEEK (Top element dekhna)
     * 1. Agar top == -1 ho to Stack empty
     * 2. Warna arr[top] print karo
     */

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    /*
     * ALGORITHM : ISEMPTY
     * 1. Agar top == -1 ho to true return karo
     * 2. Warna false return karo
     */

    public boolean isEmpty() {
        return top == -1;
    }

    /*
     * ALGORITHM : DISPLAY
     * 1. Agar top == -1 ho to Stack empty
     * 2. top se 0 tak loop chalao
     * 3. Har element print karo
     */

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
