package algorithms;

public class TwoArraysEqual {

	// даны два массива одинаковой длины, заполненные уникальными значениями типа int.
	// Необходимо определить отличны ли массивы. Решить задачу максимальным количеством способов.
	// Порядок важен, т.е. 1,2,3 и 1,3,2 - разные массивы.
	// Так же решить случай когда порядок не важен, т.е. 1,2,3 и 1,3,2 - одинаковые массивы

	public static void main(String[] args) {
		TwoArraysEqual task = new TwoArraysEqual();

		int[] arr1 = {3, 2, 54};
		int[] arr2 = {3, 2, 5};

		System.out.println("Arrays equal: " + task.resolve(arr1, arr2));
	}

	private boolean resolve(int[] arr1, int[] arr2) {
		boolean result = true;
		for (int i = 0; i < arr1.length; i++) {
			int currentArr1 = arr1[i];
			int currentArr2 = arr2[i];
			if (currentArr1 != currentArr2) {
				return false;
			}
		}
		return result;
	}

}
