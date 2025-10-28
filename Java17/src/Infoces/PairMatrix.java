package Infoces;
/**
 * Write a program for swapping of two arrays.
Write a program for swapping of two strings.
Write a program to convert the string from upper case to lower case.
Write a program to convert the string from lower case to upper case.
Write a program to delete all consonants from a given string.
Write a program to count the different types of characters in given string.
Write a program to sort the characters of a string.  
Write a program for addition of two matrices.
Write a program for subtraction  of two matrices.
Write a program for multiplication of two matrices.
Write a program to find out the sum of diagonal element of a matrix.
 */
public class PairMatrix {
	static int findMaxValue(int N,int mat[][])
	{
	int maxValue = Integer.MIN_VALUE;

	for (int a = 0; a < N - 1; a++)
	for (int b = 0; b < N - 1; b++)
	for (int d = a + 1; d < N; d++)
	for (int e = b + 1; e < N; e++)
	if (maxValue < (mat[d][e] - mat[a][b]))
	maxValue = mat[d][e] - mat[a][b];

	return maxValue;
	}

	public static void main (String[] args)
	{
	int N = 5;

	int mat[][] = {
	{ 1, 2, -1, -4, -20 },
	{ -8, -3, 4, 2, 1 },
	{ 3, 8, 6, 1, 3 },
	{ -4, -1, 1, 7, -6 },
	{ 0, -4, 10, -5, 1 }
	};

	System.out.print("Maximum Value is " + findMaxValue(N,mat));
	}
}
