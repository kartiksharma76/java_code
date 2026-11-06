package stack;


public class PushOperation {

    int arr[] = new int[5];
    int top = -1;

    void push(int value) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " Inserted");
        }
    }

    public static void main(String[] args) {

        PushOperation obj = new PushOperation();

        obj.push(10);
        obj.push(20);
        obj.push(30);
    }
}
