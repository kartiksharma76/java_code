package StringPrograms;

public class StackEx {
    int[] arr = new int[5];
    int top = -1;

    // insert value

    public static void main(String[] args) {
        StackEx s = new StackEx();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        s.peek();
        s.pop();
        s.display();


    }

    // removed value

    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " : <-Pushed");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
        } else {
            System.out.println(arr[top] + " : popped");
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("Top element :" + arr[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("stack elements : ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
