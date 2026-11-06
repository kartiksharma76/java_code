package stack;

public class PopOperation {
    int arr[] = {10,20,30,40};
    int top = 3;

    void pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println("Removed: " + arr[top]);
            top--;
        }
    }

    public static void main(String[] args) {
        PopOperation obj = new PopOperation();
        obj.pop();
        obj.pop();
    }

}
