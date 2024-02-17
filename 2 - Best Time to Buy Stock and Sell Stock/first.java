public class first{
  public int findMaxProfit(int[] prices){
    int min = prices[0];
    int max = 0;
    int profit = 0;

    for (int i = 1; i < prices.length; i++){
      if (prices[i] < min){
        min = prices[i];
      }
      else if (prices[i] > min && prices[i] - min > profit){
        max = prices[i];
        profit = max - min;
      }
    }
    
    return profit;
  }
}
