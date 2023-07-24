package algorithms.sortandsearch;

import java.util.*;

public class BubbleSort {

	//Сложность алгоритма: О(n2)

	public static void main(String[] args) {
		BubbleSort task = new BubbleSort();

		int[] values = {12, 6, 4, 1, 15, 10};

		task.sort(values);

		System.out.println(Arrays.toString(values));
	}

	private void sort(int[] values) {

		for (int i = 0; i < values.length - 1; i++) {

			for(int j = 0; j < values.length - 1 - i; j++) {

				if(values[j + 1] < values[j]) {
					int swap = values[j];
					values[j] = values[j + 1];
					values[j + 1] = swap;
				}
			}
		}
	}
}
