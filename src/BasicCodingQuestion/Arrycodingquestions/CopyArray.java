
package BasicCodingQuestion.Arrycodingquestions;

import static java.lang.System.arraycopy;

public class CopyArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        // 1. Reference copy
        int[] b = a;

        // 2. clone()
        int[] c = a.clone();

        // 3. Arrays.copyOf()
        int[] d = java.util.Arrays.copyOf(a, 5);

        // 4. System.arraycopy()
        int[] e = new int[3];
        System.arraycopy(a, 0, e, 0, 3);

        System.out.println(java.util.Arrays.toString(b));
        System.out.println(java.util.Arrays.toString(c));
        System.out.println(java.util.Arrays.toString(d));
        System.out.println(java.util.Arrays.toString(e));
    }
}
