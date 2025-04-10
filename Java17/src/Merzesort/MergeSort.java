package Merzesort;

public class MergeSort {
/**
 * first we create the divide method 
 * if the array has 1 or 0 element,its already sorted
 * find the middle point to divide the array 
 * recursively divide the left half
 * recursively divide the right half
 * merge the sorted halves
 * 
 * 
 */
public static void divide(int[]arr,int start,int end) {
	if(start >=end) {
		return ;
	}
	int mid =start+(end-start)/2;
	divide(arr, start, mid);
	divide(arr, mid+1, end);
	merge(arr,start,mid,end);
}
/**
 * temporary array to hold merged result
 * pointer for the left subarray
 * pointer for the right subarray
 * point for the merged array
 * compare the element from both halves and add the smaller one to merged array
 * if the element are left in the first half add them
 * if the element are left in the second half,add them
 * copy for merged array back into original array
 */
private static void merge(int[] arr, int start, int mid, int end) {

	int[] merged = new int[end - start + 1];
    int left = start;
    int right = mid + 1;
    int i = 0;

    while (left <= mid && right <= end) {
        if (arr[left] <= arr[right]) {
            merged[i++] = arr[left++];
        } else {
            merged[i++] = arr[right++];
        }
    }

    while (left <= mid) {
        merged[i++] = arr[left++];
    }

    while (right <= end) {
        merged[i++] = arr[right++];
    }

    for (int k = 0; k < merged.length; k++) {
        arr[start + k] = merged[k];
    }
}

public static void main(String[] args) {
	int arr[]= {4,6,3,5,9,8,10,12,1};
	int n=arr.length;
    divide(arr, 0, n-1);
    System.out.println("merged sort array:");
    for(int i=0;i<n;i++) {
    	System.out.print(arr[i]+" ");
    	
    }
    System.out.println();
}

}