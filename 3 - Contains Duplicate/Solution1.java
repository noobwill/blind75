// time complexity of O(n^2)
public class Solution1{
  public boolean containsDuplicate(int[] nums){
    int n = nums.length;

    for (int i = 0; i < n; i++){
      for (int j = 0; j < i; j++){
        if (nums[j] == nums[i]){
          return true;
        }
      }
    }

    return false;
  }
}
