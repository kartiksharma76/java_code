package litcode;

public class ReverseStr {
	public void reverseStr(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

	}

	public static void main(String[] args) {
		ReverseStr str = new ReverseStr();
		char[] arr = { 'K', 'A', 'R', 'T', 'I', 'K' };
		str.reverseStr(arr);
		System.out.println(arr);
	}
}
