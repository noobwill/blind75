import java.util.Arrays;

public class Solution1{
  public static void main(String[] args){
    int[] nums = new int[]{-1, 1, 0, -3, 3};

    System.out.println(Arrays.toString(findProductExceptSelf(nums)));
  }
  
  public static int[] findProductExceptSelf(int[] nums){
    int n = nums.length;
    int[] products = new int[n];

    for (int i = 0; i < n; i++){
      int product = 1;

      for (int j = 0; j < n; j++){
        if (i == j){
          continue;
        }

        if (nums[j] == 0){
          product = 0;
          break;
        }

        product *= nums[j];
      }

      products[i] = product;
    }

    return products;
  }
}
