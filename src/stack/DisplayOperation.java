package stack;


public class DisplayOperation {

    int arr[] = {10, 20, 30, 40};
    int top = 3;

    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        DisplayOperation obj = new DisplayOperation();

        obj.display();
    }
}
