import java.util.Arrays;

public Solution2{
  public boolean containsDuplicate(int[] nums){
    int n = nums.length;

    Arrays.sort(nums);

    for (int i = 1; i < n; i++){
      if (nums[i] == nums[i - 1]){
        return true;
      }
    }

    return false;
  }
}
