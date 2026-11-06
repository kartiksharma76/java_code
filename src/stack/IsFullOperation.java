package stack;

public class IsFullOperation {
    int[]arr = new int[5];
    int top = 4;

    void isFull(){

        if (top == arr.length - 1){
            System.out.println("Stack is Full");
        }else {
            System.out.println("Stack is Not Full");
        }
    }

    public static void main(String[] args) {
        IsFullOperation obj = new IsFullOperation();
        obj.isFull();
    }
}
