package algorithms;

public class PalindromeNumber {

	//Given an integer x, return true if x is a palindrome, and false otherwise.
	//
	//Example 1:
	//Input: x = 121
	//Output: true
	//
	//Example 2:
	//Input: x = 10
	//Output: false

	public static void main(String[] args) {
		PalindromeNumber task = new PalindromeNumber();

		System.out.println(task.resolve(121));
	}

	private boolean resolve(int num) {
		String str = String.valueOf(num);
		int n = str.length();

		for (int i=0; i < n/2; i++) {
			if (str.charAt(i) != str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
}
