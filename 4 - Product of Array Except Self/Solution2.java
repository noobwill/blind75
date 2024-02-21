public class Solution2{
  public static int[] findProductExceptSelf(int[] nums){
    int n = nums.length;

    int product = 1;
    for (int num : nums){
      product *= num;
    }
    
    int[] products = new int[n];
    for (int i = 0; i < n; i++){
      products[i] = product / nums[i];
    }

    return products;
  }
}
