package javainterview;
//-> main start

//-> 3D array k initialize

//-> s = 0

//-> outer loop (y[][] : k)

//-> 1st y = { {23,45,21}, {45,89,90} }
// -> inner loop (z[] : y)

//     -> z = {23,45,21}
//        -> s = 0+23 = 23
//        -> s = 23+45 = 68
//        -> s = 68+21 = 89

//     -> z = {45,89,90}
//        -> s = 89+45 = 134
//        -> s = 134+89 = 223
//        -> s = 223+90 = 313

//-> 2nd y = { {78,90,23} }

//     -> z = {78,90,23}
//        -> s = 313+78 = 391
//        -> s = 391+90 = 481
//        -> s = 481+23 = 504

//-> 3rd y = { {54,89,21} }

//     -> z = {54,89,21}
//        -> s = 504+54 = 558
//        -> s = 558+89 = 647
//        -> s = 647+21 = 668

//-> print s
//-> s:668
public class D {
	public static void main(String[] args) {
		int k[][][] = { { { 23, 45, 21 }, { 45, 89, 90 } }, { { 78, 90, 23 } }, { { 54, 89, 21 } } };

		int s = 0;
		for (int y[][] : k) {
			for (int z[] : y) {
				for (int a : z) {
					s = s + a;
				}
			}
		}
		System.out.println("s:" + s);
	}
}
