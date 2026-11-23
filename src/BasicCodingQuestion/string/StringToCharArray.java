package BasicCodingQuestion.string;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Java";
        char[] arr = s.toCharArray();
        arr[0] = 'L';
        String t = new String(arr);
        System.out.println(t);  // Lava System.out.println(String.valueOf(arr)); // Lava
    }
}
