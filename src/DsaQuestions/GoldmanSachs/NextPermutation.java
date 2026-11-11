package DsaQuestions.GoldmanSachs;

public class NextPermutation {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int index = -1;


        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(arr, 0, n - 1);
        } else {
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
            reverse(arr, index + 1, n - 1);

        }
        System.out.print("Next Permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
