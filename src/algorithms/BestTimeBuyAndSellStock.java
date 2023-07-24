package algorithms;

public class BestTimeBuyAndSellStock {

	//You are given an array prices where prices[i] is the price of a given stock on the ith day.
	//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
	//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
	//
	//Example 1:
	//Input: prices = [7,1,5,3,6,4]
	//Output: 5

	public static void main(String[] args) {
		BestTimeBuyAndSellStock task = new BestTimeBuyAndSellStock();

		int[] arr = {7, 1, 5, 3, 6, 4};
		System.out.println(task.resolve(arr));
	}

	private int resolve(int[] prices) {
		int buy = Integer.MAX_VALUE, sell = 0;

		for (int price : prices) {
			buy = Math.min(buy, price);
			sell = Math.max(sell, price - buy);

			System.out.println("buy: " + buy + ", sell: " + sell);
		}

		return sell;
	}
}
