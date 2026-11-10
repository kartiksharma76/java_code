package stack;


public class SearchOperation {

    int arr[] = {10, 20, 30, 40};
    int top = 3;

    void search(int value) {

        for (int i = top; i >= 0; i--) {

            if (arr[i] == value) {
                System.out.println("Element Found");
                System.out.println("Position: " + (top - i + 1));
                return;
            }
        }

        System.out.println("Element Not Found");
    }

    public static void main(String[] args) {

        SearchOperation obj = new SearchOperation();

        obj.search(20);
    }
}
