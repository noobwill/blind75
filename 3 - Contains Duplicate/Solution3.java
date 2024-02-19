import java.util.Set;
import java.util.HashSet;

public Solution3{
  public boolean containsDuplicate(int[] nums){
    int n = nums.length;

    Set<Integer> set = new HashSet<>();

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
