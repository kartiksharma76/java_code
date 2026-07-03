package multithreadingrealproblem;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class MergeSortTask extends RecursiveAction {

	private final int[] array;
	private final int left;
	private final int right;

	public MergeSortTask(int[] array, int left, int right) {

		this.array = array;
		this.left = left;
		this.right = right;
	}

	@Override
	protected void compute() {

		if (left >= right)
			return;

		int mid = (left + right) / 2;

		MergeSortTask leftTask = new MergeSortTask(array, left, mid);

		MergeSortTask rightTask = new MergeSortTask(array, mid + 1, right);

		invokeAll(leftTask, rightTask);

		merge(left, mid, right);
	}

	private void merge(int left, int mid, int right) {

		int[] temp = new int[right - left + 1];

		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {

			if (array[i] <= array[j])
				temp[k++] = array[i++];
			else
				temp[k++] = array[j++];
		}

		while (i <= mid)
			temp[k++] = array[i++];

		while (j <= right)
			temp[k++] = array[j++];

		System.arraycopy(temp, 0, array, left, temp.length);
	}
}

public class ParallelMergeSort {

	public static void main(String[] args) {

		int[] array = {

				38, 27, 43, 3, 9, 82, 10 };

		ForkJoinPool pool = new ForkJoinPool();

		pool.invoke(new MergeSortTask(array, 0, array.length - 1));

		System.out.println(Arrays.toString(array));
	}
}