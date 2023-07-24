package algorithms.sortandsearch;

public class LinearSearch {

	public static void main(String[] args) {
		LinearSearch task = new LinearSearch();

		int[] values = {1, 2, 3, 4, 5, 6};
		int valueToFind = 5;

		System.out.println("index: " + task.linearSearch(values, valueToFind));
	}

	private int linearSearch(int[] values, int valueToFind) {

		for (int i = 0; i < values.length; i++) {
			if (values[i] == valueToFind) {
				return i;
			}
		}

		return -1;
	}
}
