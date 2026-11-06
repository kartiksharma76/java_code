package stack;

public class IsEmptyOperation {
    int[] arr = new int[5];
    int top = -1;

    public static void main(String[] args) {
        IsEmptyOperation obj = new IsEmptyOperation();
        obj.isEmpty();
    }

    void isEmpty() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }

}
