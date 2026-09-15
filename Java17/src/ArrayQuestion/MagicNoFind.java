package ArrayQuestion;

public class MagicNoFind {
public static void main(String[] args) {
	int[]arr= {-1,1,2,3,5,7};
	int magicNumber=findMagicNumber(arr);
	if(magicNumber!=-1) {
		System.out.println(magicNumber);
	}else {
		System.out.println("no magic found:");
	}
}

private static int findMagicNumber(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==i) {
			return arr[i];
		}
	}
	return -1;
}
}
