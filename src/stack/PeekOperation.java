package stack;

public class PeekOperation {
    int[]arr = {10,20,30,40};
    int top = 3;

    void peek(){

        if (top == -1){
            System.out.println("Stack is Empty");
        }else {
            System.out.println("Top Element: " + arr[top]);
        }
    }

    public static void main(String[] args) {
        PeekOperation obj = new PeekOperation();
        obj.peek();
    }
}
