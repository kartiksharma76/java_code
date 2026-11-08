package stack;


public class SizeOperation {

    int arr[] = {10, 20, 30, 40};
    int top = 3;

    void size() {

        System.out.println("Stack Size: " + (top + 1));
    }

    public static void main(String[] args) {

        SizeOperation obj = new SizeOperation();

        obj.size();
    }
}

