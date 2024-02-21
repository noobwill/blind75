import java.util.Arrays;

public class Solution1{
  public static void main(String[] args){
    int[] nums = new int[]{-1, 1, 0, -3, 3};

    System.out.println(Arrays.toString(findProductExceptSelf(nums)));
  }
  
  public static int[] findProductExceptSelf(int[] nums){
    int n = nums.length;
    int[] product = new int[n];

    for (int i = 0; i < n; i++){
      int hold = 1;

      for (int j = 0; j < n; j++){
        if (i == j){
          continue;
        }

        if (nums[j] == 0){
          hold = 0;
          break;
        }

        hold *= nums[j];
      }

      product[i] = hold;
    }

    return product;
  }
}
