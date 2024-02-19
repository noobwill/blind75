import java.util.Set;
import java.util.HashSet;

public class Solution3{
  public boolean containsDuplicate(int[] nums){
    int n = nums.length;

    Set<Integer> set = new HashSet<>();

    if (n == 0 || n == 1){
      return false;
    }
    else if (n == 2){
      return nums[0] == nums[1];
    }

    for (int num : nums){
      if (!set.contains(num)){
        set.add(num);
      }
      else{
        return true;
      }
    }

    return false;
  }
}
