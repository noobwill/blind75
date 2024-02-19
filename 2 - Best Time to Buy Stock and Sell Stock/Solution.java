public class Solution{
  public int findMaxProfit(int[] prices){
    // left is buy price
    int left = 0;
    // right is sell price
    int right = 1;
    // zero profit at the beginning
    int max_profit = 0;

    // iterate while the right pointer has not passed past the end of the array, i.e. until out of bounds
    while (right < prices.length){
      // if transaction is profitable, compute profit and compare against max profit so far
      if (prices[left] < prices[right]){
        int curr_profit = prices[right] - prices[left];
        max_profit = Math.max(curr_profit, max_profit);
      }
      // if transaction is not profitable, update left pointer to be at new minimum
      else{
        left = right;
      }
      // update right pointer regardless
      right++;
    }

    return max_profit;
  }
}
