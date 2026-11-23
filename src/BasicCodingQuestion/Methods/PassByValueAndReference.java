
package BasicCodingQuestion.Methods;

public class PassByValueAndReference {

    static void change(int x) {
        x = 100;
    }

    static void changeArr(int[] a) {
        a[0] = 100;
    }

    public static void main(String[] args) {

        // Pass by Value
        int n = 5;
        change(n);
        System.out.println(n);

        // Array reference value is also passed by value
        int[] arr = {1, 2};
        changeArr(arr);
        System.out.println(arr[0]);
    }
}
