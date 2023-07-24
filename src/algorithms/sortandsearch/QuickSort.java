package algorithms.sortandsearch;

import java.util.*;

public class QuickSort {

	//Сложность алгоритма: О(n2)

	public static void main(String[] args) {
		QuickSort task = new QuickSort();

		int[] values = {12, 6, 4, 1, 15, 10};

		task.quickSort(values, 0, values.length - 1);

		System.out.println(Arrays.toString(values));
	}

	private void quickSort(int[] values, int low, int high) {
		
		if (values.length == 0 || low >= high) {
			return;
		}

		int middle = low + (high - low) / 2;
		int border = values[middle];
		
		int i = low, j = high;

		while (i <= j) {
			while (values[i] < border) {
				i++;
			}
			while (values[j] > border) {
				j--;
			}
			if (i <= j) {
				int swap = values[i];
				values[i] = values[j];
				values[j] = swap;
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quickSort(values, low, j);
		}
		if (high > i) {
			quickSort(values, i, high);
		}
	}
}
