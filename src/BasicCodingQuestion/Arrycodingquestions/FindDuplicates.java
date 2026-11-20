
package BasicCodingQuestion.Arrycodingquestions;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3, 2};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    boolean alreadyPrinted = false;

                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.println(arr[i]);
                    }

                    break;
                }
            }
        }
    }
}
