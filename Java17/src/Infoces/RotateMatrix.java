package Infoces;

public class RotateMatrix {
	static void reverseRows (int mat[][])
	{
	int n = mat.length;
	for (int i = 0; i < mat.length; i++){
	for (int j = 0; j < mat.length/ 2; j++){
	int temp = mat[i][j];
	mat[i][j] = mat[i][n - j - 1];
	mat[i][n - j - 1] = temp;
	}
	}

	}


	static void transpose (int arr[][])
	{
	for (int i = 0; i < arr.length; i++)
	for (int j = i; j < arr[0].length; j++){
	int temp = arr[j][i];
	arr[j][i] = arr[i][j];
	arr[i][j] = temp;
	}
	}

	static void printMatrix (int arr[][]){
	for (int i = 0; i < arr.length; i++){
	for (int j = 0; j < arr[0].length; j++)
	System.out.print (arr[i][j] + " ");
	System.out.println ("");
	}
	}

	static void rotate90 (int arr[][])
	{
	transpose (arr);
	reverseRows (arr);
	}


	public static void main (String[]args)
	{
	int arr[][] = { {1, 2, 3, 4},
	{5, 6, 7, 8},
	{9, 10, 11, 12},
	{13, 14, 15, 16}
	};

	rotate90 (arr);
	printMatrix (arr);
	}
}
