package algorithms;

public class ArrayFindElLessThanMax {

	//дан массив заполненный уникальными сзачениями типа int,
	// необходимо найти элемент больше всех но меньше касимального

	public static void main(String[] args) {
		ArrayFindElLessThanMax task = new ArrayFindElLessThanMax();

		int[] arr = {-7, 1, -5, 3, 6, 4};
		System.out.println(task.resolve(arr));
	}

	private int resolve(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (current > max) {
				max = current;
			}
		}

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (current > result && current < max) {
				result = current;
			}

		}

		return result;
	}

}
