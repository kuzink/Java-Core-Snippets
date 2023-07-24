package algorithms.sortandsearch;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch task = new BinarySearch();

		int[] values = {1, 2, 3, 4, 5, 6};
		int valueToFind = 5;

		System.out.println("index: " + task.binarySearch(values, valueToFind, 0, values.length - 1));
	}

	private int binarySearch(int[] values, int valueToFind, int left, int right) {

		if (left == right) {
			return valueToFind == values[left] ? left : -1;
		}

		int middle = left + (right - left) / 2;

		if (valueToFind > values[middle]) {
			return binarySearch(values, valueToFind, middle + 1, right);
		} else if (valueToFind < values[middle]) {
			return binarySearch(values, valueToFind, left, middle - 1);
		}

		return middle;
	}
}
